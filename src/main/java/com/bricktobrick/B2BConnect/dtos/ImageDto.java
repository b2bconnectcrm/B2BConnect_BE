package com.bricktobrick.B2BConnect.dtos;

public class ImageDto {
	
	private String imageName;
	
	private String path;

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public ImageDto(String imageName, String path) {
		this.imageName = imageName;
		this.path = path;
	}
	
	
	

}
