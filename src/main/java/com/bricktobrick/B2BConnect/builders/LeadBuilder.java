package com.bricktobrick.B2BConnect.builders;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bricktobrick.B2BConnect.dtos.LeadDto;
import com.bricktobrick.B2BConnect.entity.Lead;
import com.bricktobrick.B2BConnect.entity.LeadSource;
import com.bricktobrick.B2BConnect.entity.LeadStatus;

@Component
public class LeadBuilder {

	public Lead convertToLeadModel(LeadDto leadDto) {

		Lead lead = new Lead();
		lead.setAddress(leadDto.getAddress());
		lead.setAnnualIncome(leadDto.getAnnualIncome());
		lead.setEmail(leadDto.getEmail());
		lead.setFirstName(leadDto.getFirstName());
		lead.setId(leadDto.getId());
		lead.setIndustry(leadDto.getIndustry());
		lead.setLastName(leadDto.getLastName());

		if (leadDto.getLeadSource() != null) {

			if (leadDto.getLeadSource().equals(LeadSource.COMPANYLEAD.getName())) {
				lead.setLeadSource(LeadSource.COMPANYLEAD);
			} else if (leadDto.getLeadSource().equals(LeadSource.OWNLEAD.getName())) {
				lead.setLeadSource(LeadSource.OWNLEAD);
			} else if (leadDto.getLeadSource().equals(LeadSource.SHAREDLEAD.getName())) {
				lead.setLeadSource(LeadSource.SHAREDLEAD);
			} else if (leadDto.getLeadSource().equals(LeadSource.COLDCALLLEAD.getName())) {
				lead.setLeadSource(LeadSource.COLDCALLLEAD);
			} else {
				lead.setLeadSource(LeadSource.CPLEAD);
			}
		}
		if (leadDto.getLeadStatus() != null) {
			if ("COLD".equals(leadDto.getLeadStatus())) {
				lead.setLeadStatus(LeadStatus.COLD);
			} else if ("HOT".equals(leadDto.getLeadStatus())) {
				lead.setLeadStatus(LeadStatus.HOT);
			} else if ("WARM".equals(leadDto.getLeadStatus())) {
				lead.setLeadStatus(LeadStatus.WARM);
			} else if ("CLOSE".equals(leadDto.getLeadStatus())) {
				lead.setLeadStatus(LeadStatus.CLOSE);
			}
		}

		lead.setMiddleName(leadDto.getMiddleName());
		lead.setMobile(leadDto.getMobile());
		lead.setOccupation(leadDto.getOccupation());
		lead.setOwner(leadDto.getOwner());
		return lead;
	}

	public LeadDto convertToLeadDto(Lead lead) {

		LeadDto leadDto = new LeadDto();
		leadDto.setAddress(lead.getAddress());
		leadDto.setAnnualIncome(lead.getAnnualIncome());
		leadDto.setEmail(lead.getEmail());
		leadDto.setFirstName(lead.getFirstName());
		leadDto.setId(lead.getId());
		leadDto.setIndustry(lead.getIndustry());
		leadDto.setLastName(lead.getLastName());
		leadDto.setLeadSource(lead.getLeadSource().getName());
		
		if (lead.getLeadStatus() != null) {
			
			if ("COLD".equals(lead.getLeadStatus().name())) {
				leadDto.setLeadStatus("COLD");
			} else if ("HOT".equals(lead.getLeadStatus().name())) {
				leadDto.setLeadStatus("HOT");
			} else if ("WARM".equals(lead.getLeadStatus().name())) {
				leadDto.setLeadStatus("WARM.");
			} else if ("CLOSE".equals(lead.getLeadStatus().name())) {
				leadDto.setLeadStatus("CLOSE");
			}
		}
		
		leadDto.setMiddleName(lead.getMiddleName());
		leadDto.setMobile(lead.getMobile());
		leadDto.setOccupation(lead.getOccupation());
		if (lead.getCreatedDate() != null) {
			leadDto.setCreatedDate(lead.getCreatedDate().toString());
		}
		leadDto.setOwner(lead.getOwner());

		return leadDto;
	}

	public List<LeadDto> convertToListModel(List<Lead> leads) {

		List<LeadDto> leadDtos = new ArrayList<>();
		if (leads != null && leads.size() > 0) {
			leads.forEach(lead -> {
				leadDtos.add(convertToLeadDto(lead));
			});
		}
		return leadDtos;

	}

	public LeadDto convertModelToDto(Lead lead, LeadDto leadDto) {

		leadDto.setAddress(lead.getAddress());
		leadDto.setAnnualIncome(lead.getAnnualIncome());
		leadDto.setEmail(lead.getEmail());
		leadDto.setFirstName(lead.getFirstName());
		leadDto.setId(lead.getId());
		leadDto.setIndustry(lead.getIndustry());
		leadDto.setLastName(lead.getLastName());
		leadDto.setLeadSource(lead.getLeadSource().getName());
		leadDto.setLeadStatus(lead.getLeadStatus().name());
		leadDto.setMiddleName(lead.getMiddleName());
		leadDto.setMobile(lead.getMobile());
		leadDto.setOccupation(lead.getOccupation());
		if (lead.getCreatedDate() != null) {
			leadDto.setCreatedDate(lead.getCreatedDate().toString());
		}
		leadDto.setOwner(lead.getOwner());
		return leadDto;
	}

	public Lead convertDtoToModel(Lead lead, LeadDto leadDto) {

		lead.setAddress(leadDto.getAddress());
		lead.setAnnualIncome(leadDto.getAnnualIncome());
		lead.setEmail(leadDto.getEmail());
		lead.setFirstName(leadDto.getFirstName());
		lead.setId(leadDto.getId());
		lead.setIndustry(leadDto.getIndustry());
		lead.setLastName(leadDto.getLastName());
		if (leadDto.getLeadSource() != null) {
			if (leadDto.getLeadSource().equals(LeadSource.COMPANYLEAD.getName())) {
				lead.setLeadSource(LeadSource.COMPANYLEAD);
			} else if (leadDto.getLeadSource().equals(LeadSource.OWNLEAD.getName())) {
				lead.setLeadSource(LeadSource.OWNLEAD);
			} else if (leadDto.getLeadSource().equals(LeadSource.SHAREDLEAD.getName())) {
				lead.setLeadSource(LeadSource.SHAREDLEAD);
			} else if (leadDto.getLeadSource().equals(LeadSource.COLDCALLLEAD.getName())) {
				lead.setLeadSource(LeadSource.COLDCALLLEAD);
			} else {
				lead.setLeadSource(LeadSource.CPLEAD);
			}
		}

		if (leadDto.getLeadStatus() != null) {
			
			if ("COLD".equals(leadDto.getLeadStatus())) {
				lead.setLeadStatus(LeadStatus.COLD);
			} else if ("HOT".equals(leadDto.getLeadStatus())) {
				lead.setLeadStatus(LeadStatus.HOT);
			} else if ("WARM".equals(leadDto.getLeadStatus())) {
				lead.setLeadStatus(LeadStatus.WARM);
			} else if ("CLOSE".equals(leadDto.getLeadStatus())) {
				lead.setLeadStatus(LeadStatus.CLOSE);
			}
		}

		lead.setMiddleName(leadDto.getMiddleName());
		lead.setMobile(leadDto.getMobile());
		lead.setOccupation(leadDto.getOccupation());
		lead.setOwner(leadDto.getOwner());
		return lead;
	}
}
