package com.bricktobrick.B2BConnect.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bricktobrick.B2BConnect.builders.PropertyBuilder;
import com.bricktobrick.B2BConnect.dtos.PropertyDto;
import com.bricktobrick.B2BConnect.entity.Property;
import com.bricktobrick.B2BConnect.repository.PropertyRepository;
import com.bricktobrick.B2BConnect.services.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	private PropertyRepository propertyRepository;

	@Autowired
	private PropertyBuilder propertyBuilder;

	@Override
	public void addProperty(PropertyDto propertyDto) {
		// TODO Auto-generated method stub
		Property property = propertyBuilder.convertToPropertyModel(propertyDto);
		if (property != null) {
			propertyRepository.save(property);
		}
	}

	@Override
	public List<PropertyDto> findAllProperties() {
		// TODO Auto-generated method stub
		List<Property> properties = propertyRepository.findAll();

		List<PropertyDto> propertyDtos = propertyBuilder.convertToListModel(properties);
		return propertyDtos;
	}

	@Override
	public void updateProperty(Long id, PropertyDto propertyDto) {
		// TODO Auto-generated method stub
		Property property = propertyRepository.findById(id).get();
		if (property != null) {
			if (property.getId() == propertyDto.getId()) {
				Property property2 = propertyBuilder.convertDtoToModel(property, propertyDto);
				propertyRepository.save(property2);
			}
		}
	}

	@Override
	public PropertyDto findProperty(Long id) {
		// TODO Auto-generated method stub
		PropertyDto propertyDto = null;
		Property property = propertyRepository.findById(id).get();
		if (property != null) {
			propertyDto = propertyBuilder.convertToPropetyDto(property);
		}
		return propertyDto;
	}

	@Override
	public void deleteProperty(Long id) {
		// TODO Auto-generated method stub
		propertyRepository.deleteById(id);
	}

}
