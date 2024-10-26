package com.bricktobrick.B2BConnect.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.bricktobrick.B2BConnect.dtos.ImageDto;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/file")
@CrossOrigin
public class UploadController {

	@Value("${fileUploadPath}")
	private String fileUploadPath;

	@Value("${spring.cloud.azure.storage.blob.container-name}")
	private String containerName;

	@Value("${spring.cloud.azure.storage.blob.connection-string}")
	private String connectionString;
	private BlobServiceClient blobServiceClient;
	private BlobContainerClient containerClient;

	@PostConstruct
	public void init() {
		blobServiceClient = new BlobServiceClientBuilder().connectionString(connectionString).buildClient();
		 containerClient = blobServiceClient.getBlobContainerClient(containerName);
	}

	@PostMapping("/upload")
	public ImageDto uploadLocal(@RequestParam("file") MultipartFile file) throws IOException {
		String extension = getFileExtension(file.getOriginalFilename());
		validateImageExtension(extension);

		String randomFilename = UUID.randomUUID().toString() + "." + extension;
		Path rootLocation = Paths.get(fileUploadPath);
		Files.copy(file.getInputStream(), rootLocation.resolve(randomFilename));

		return new ImageDto(randomFilename, fileUploadPath);
	}

	@PostMapping("/upload1")
	public ImageDto uploadToBlob(@RequestParam("file") MultipartFile file) throws IOException {
		String extension = getFileExtension(file.getOriginalFilename());
		validateImageExtension(extension);

		String blobFilename = UUID.randomUUID().toString() + "." + extension; // Generate unique filename
		BlobClient blobClient = containerClient.getBlobClient(blobFilename);
		blobClient.upload(file.getInputStream(), file.getSize(), true);

		String imageUrl = blobClient.getBlobUrl();
		return new ImageDto(blobFilename, imageUrl);
	}

	private void validateImageExtension(String extension) {
		if (!(extension.equalsIgnoreCase("png") || extension.equalsIgnoreCase("jpeg")
				|| extension.equalsIgnoreCase("jpg"))) {
			throw new RuntimeException("Please select a file with .png, .jpeg, or .jpg");
		}
	}

	@GetMapping("/image/{filename:.+}")
	@ResponseBody
	public ResponseEntity<Resource> getFile(@PathVariable String filename) throws MalformedURLException {
		Path path = load(filename);
		Resource file = new UrlResource(path.toUri());

		if (file.exists() || file.isReadable()) {
			return ResponseEntity.ok()
					.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
					.body(file);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

	public Path load(String filename) {
		return Paths.get(fileUploadPath).resolve(filename);
	}

	private static String getFileExtension(String fileName) {
		int lastIndex = fileName.lastIndexOf('.');
		return (lastIndex != -1 && lastIndex != 0) ? fileName.substring(lastIndex + 1) : "";
	}
}
