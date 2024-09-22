package com.bricktobrick.B2BConnect.services;

import java.util.List;

import com.bricktobrick.B2BConnect.dtos.LeadDto;

public interface LeadService {

	void addLead(LeadDto leadDto);

	List<LeadDto> findAllLeads();

	LeadDto findLead(Long id);

	void updateLead(Long id, LeadDto leadDto);

	void deleteLead(Long id);

}
