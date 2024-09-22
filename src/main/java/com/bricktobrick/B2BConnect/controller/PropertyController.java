package com.bricktobrick.B2BConnect.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bricktobrick.B2BConnect.dtos.ImageDto;
import com.bricktobrick.B2BConnect.dtos.PropertyDto;
import com.bricktobrick.B2BConnect.services.PropertyService;


@RestController
@RequestMapping(value = "/property")
@CrossOrigin
public class PropertyController {

	@Value("${fileUploadPath}")
	private String fileUploadPath;

	@Autowired
	private PropertyService propertyService;

	@PostMapping(value = "/add")
	public void addProperty(@RequestBody PropertyDto propertyDto) {
		propertyService.addProperty(propertyDto);
	}

	@GetMapping(value = "/all")
	public List<PropertyDto> findAllProperties() {
		return propertyService.findAllProperties();
	}

	@GetMapping(value = "/{id}")
	public PropertyDto findProperty(@PathVariable(value = "id") Long id) {
		return propertyService.findProperty(id);
	}

	@PutMapping(value = "/{id}")
	public void updateProperty(@PathVariable(value = "id") Long id, @RequestBody PropertyDto propertyDto) {
		propertyService.updateProperty(id, propertyDto);
	}

	@PostMapping(value = "/map/upload/")
	public ImageDto uploadPropertyMap(@RequestBody MultipartFile file) throws IOException {
		String extension = getFileExtension(file.getOriginalFilename());
		Path rootLocation = Paths.get(fileUploadPath);
		if (!(extension.equalsIgnoreCase("png") || extension.equalsIgnoreCase("jpeg"))) {
			throw new RuntimeException("Please select file with .png or .jpeg");
		}
		String random = UUID.randomUUID().toString() + "." + extension;
		Files.copy(file.getInputStream(), rootLocation.resolve(random));
		return new ImageDto(random, fileUploadPath);
	}

	private static String getFileExtension(String fileName) {
		if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
			return fileName.substring(fileName.lastIndexOf(".") + 1);
		else
			return "";
	}

	@GetMapping("/image/{filename:.+}")
	@ResponseBody
	public ResponseEntity<Resource> getFile(@PathVariable String filename)
			throws MalformedURLException, URISyntaxException {

		try {
			Path path = load(filename);
			Resource file = new UrlResource(path.toUri());
			if ( file.exists() ||  file.isReadable()) {
				return ResponseEntity.ok()
						.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
						.body(file);
			} else {
				throw new RuntimeException("Could not read file: " + filename);

			}
		} catch (MalformedURLException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

	
	public Path load(String filename) {
		Path rootLocation = Paths.get(fileUploadPath);
		return rootLocation.resolve(filename);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteProperty(@PathVariable(value = "id") Long id) {
		propertyService.deleteProperty(id);
	}


}
