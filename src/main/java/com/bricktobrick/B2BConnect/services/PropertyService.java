package com.bricktobrick.B2BConnect.services;

import java.util.List;

import com.bricktobrick.B2BConnect.dtos.PropertyDto;

public interface PropertyService {

	void addProperty(PropertyDto propertyDto);

	List<PropertyDto> findAllProperties();

	void updateProperty(Long id, PropertyDto propertyDto);

	PropertyDto findProperty(Long id);

	void deleteProperty(Long id);

}
