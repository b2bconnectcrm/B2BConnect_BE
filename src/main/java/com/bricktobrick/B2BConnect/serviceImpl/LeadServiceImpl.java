package com.bricktobrick.B2BConnect.serviceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bricktobrick.B2BConnect.builders.LeadBuilder;
import com.bricktobrick.B2BConnect.dtos.LeadDto;
import com.bricktobrick.B2BConnect.entity.Lead;
import com.bricktobrick.B2BConnect.entity.Property;
import com.bricktobrick.B2BConnect.repository.LeadRepository;
import com.bricktobrick.B2BConnect.repository.PropertyRepository;
import com.bricktobrick.B2BConnect.services.LeadService;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepository;

	@Autowired
	private LeadBuilder leadBuilder;

	@Autowired
	private PropertyRepository propertyRepository;

	@Override
	public void addLead(LeadDto leadDto) {
		// TODO Auto-generated method stub
		Lead lead = leadBuilder.convertToLeadModel(leadDto);
		List<Property> properties = new ArrayList<Property>();
		if(leadDto.getProperties() != null && leadDto.getProperties().size() > 0) {
			leadDto.getProperties().forEach( property ->{
			Optional<Property> optional=	propertyRepository.findById(property.getId());
			if(optional.isPresent()) {
				properties.add(optional.get());
			}
			});
			lead.setProperties(properties);
		}
		
		lead.setCreatedDate(LocalDate.now());
		if (lead != null) {
			leadRepository.save(lead);
		}

	}

	@Override
	public List<LeadDto> findAllLeads() {
		// TODO Auto-generated method stub
		List<Lead> leads = leadRepository.findAll();
		List<LeadDto> leadDtos = leadBuilder.convertToListModel(leads);
		return leadDtos;
	}

	@Override
	public LeadDto findLead(Long id) {
		// TODO Auto-generated method stub
		LeadDto leadDto = null;
		Lead lead = leadRepository.findById(id).get();
		if (lead != null) {
			leadDto = leadBuilder.convertToLeadDto(lead);
		}
		return leadDto;
	}

	@Override
	public void updateLead(Long id, LeadDto leadDto) {
		// TODO Auto-generated method stub
		Lead lead = leadRepository.findById(id).get();
		if (lead != null) {
			if (lead.getId().equals(leadDto.getId())) {
				Lead lead2 = leadBuilder.convertDtoToModel(lead, leadDto);
				leadRepository.save(lead2);
			}
		}
	}

	@Override
	public void deleteLead(Long id) {
		// TODO Auto-generated method stub
		leadRepository.deleteById(id);
	}

}
