package com.bricktobrick.B2BConnect.builders;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bricktobrick.B2BConnect.dtos.LeadDto;
import com.bricktobrick.B2BConnect.entity.Lead;
import com.bricktobrick.B2BConnect.entity.LeadSource;
import com.bricktobrick.B2BConnect.entity.LeadStatus;
import com.bricktobrick.B2BConnect.entity.NotInterestedStatus;
import com.bricktobrick.B2BConnect.entity.PropertyType;
import com.bricktobrick.B2BConnect.entity.SalesPipeline;
import com.bricktobrick.B2BConnect.entity.SubPropetyType;
import com.bricktobrick.B2BConnect.entity.VisitType;
import com.bricktobrick.B2BConnect.entity.SubPropetyType;

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

		lead.setClientInterested(leadDto.isClientInterested());
		lead.setCrossSegmentLeads(leadDto.isCrossSegmentLeads());
		lead.setComments(leadDto.getComments());
		lead.setCrossSegments(leadDto.getCrossSegments());

		if (leadDto.getNotINterestedStatus() != null) {
			if ("IrrelevantLocation".equals(leadDto.getNotINterestedStatus())) {
				lead.setNotINterestedStatus(NotInterestedStatus.IrrelevantLocation);
			} else if ("Notreachable".equals(leadDto.getNotINterestedStatus())) {
				lead.setNotINterestedStatus(NotInterestedStatus.Notreachable);
			} else if ("NotAnswering".equals(leadDto.getNotINterestedStatus())) {
				lead.setNotINterestedStatus(NotInterestedStatus.NotAnswering);
			} else if ("Allreadypurchased".equals(leadDto.getNotINterestedStatus())) {
				lead.setNotINterestedStatus(NotInterestedStatus.Allreadypurchased);
			} else if ("AlreadyintouchwithCompanyEmployee".equals(leadDto.getNotINterestedStatus())) {
				lead.setNotINterestedStatus(NotInterestedStatus.AlreadyintouchwithCompanyEmployee);
			}
		}

		if (leadDto.getPropertyType() != null) {
			if ("PLOT".equals(leadDto.getPropertyType())) {
				lead.setPropertyType(PropertyType.PLOT);
			} else if ("FLAT".equals(leadDto.getPropertyType())) {
				lead.setPropertyType(PropertyType.FLAT);
			} else if ("COMMERCIAL".equals(leadDto.getPropertyType())) {
				lead.setPropertyType(PropertyType.COMMERCIAL);
			}
		}

		if (leadDto.getSubPropertyType() != null) {
			if ("Gated".equals(leadDto.getSubPropertyType())) {
				lead.setSubPropetyType(SubPropetyType.Gated);
			} else if ("Standalone".equals(leadDto.getSubPropertyType())) {
				lead.setSubPropetyType(SubPropetyType.Standalone);
			} else if ("Resale".equals(leadDto.getSubPropertyType())) {
				lead.setSubPropetyType(SubPropetyType.Resale);
			} else if ("farmland".equals(leadDto.getSubPropertyType())) {
				lead.setSubPropetyType(SubPropetyType.farmland);
			} else if ("DTCP".equals(leadDto.getSubPropertyType())) {
				lead.setSubPropetyType(SubPropetyType.DTCP);
			}

			else if ("HMDA".equals(leadDto.getSubPropertyType())) {
				lead.setSubPropetyType(SubPropetyType.HMDA);
			} else if ("Office".equals(leadDto.getSubPropertyType())) {
				lead.setSubPropetyType(SubPropetyType.Office);
			} else if ("Retail".equals(leadDto.getSubPropertyType())) {
				lead.setSubPropetyType(SubPropetyType.Retail);
			}
		}

		if (leadDto.getSalesPipeline() != null) {
			if ("OPEN".equals(leadDto.getSalesPipeline())) {
				lead.setSalesPipeline(SalesPipeline.OPEN);
			} else if ("COLD_CALLING_MEETING".equals(leadDto.getSalesPipeline())) {
				lead.setSalesPipeline(SalesPipeline.COLDCALLING);
			} else if ("PROPOSAL".equals(leadDto.getSalesPipeline())) {
				lead.setSalesPipeline(SalesPipeline.PROPOSAL);
			}

			else if ("NEGOTIATION".equals(leadDto.getSalesPipeline())) {
				lead.setSalesPipeline(SalesPipeline.NEGOTIATION);
			} else if ("DEALS_OFFERED".equals(leadDto.getSalesPipeline())) {
				lead.setSalesPipeline(SalesPipeline.DEALSOFFERED);
			} else if ("CLOSURE".equals(leadDto.getSalesPipeline())) {
				lead.setSalesPipeline(SalesPipeline.CLOSURE);
			} else if ("CONVERSION".equals(leadDto.getSalesPipeline())) {
				lead.setSalesPipeline(SalesPipeline.CONVERSION);
			}
		}
		
		if (leadDto.getPlantodo() != null) {
			if ("F2F".equals(leadDto.getPlantodo())) {
				lead.setPlantodo(VisitType.F2F);
			} else if ("SiteVisit".equals(leadDto.getPlantodo())) {
				lead.setPlantodo(VisitType.SiteVisit);
			} else if ("Calls".equals(leadDto.getPlantodo())) {
				lead.setPlantodo(VisitType.Calls);
			} else if ("ClosureMeeting".equals(leadDto.getPlantodo())) {
				lead.setPlantodo(VisitType.ClosureMeeting);
			}
		}
		
		


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
		if(lead.getLeadSource() != null) {
			leadDto.setLeadSource(lead.getLeadSource().getName());
		}
		

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
		
		leadDto.setClientInterested(lead.isClientInterested());
		leadDto.setCrossSegmentLeads(lead.isCrossSegmentLeads());
		leadDto.setComments(lead.getComments());
		leadDto.setCrossSegments(lead.getCrossSegments());

		if (lead.getNotINterestedStatus() != null) {
			if ("IrrelevantLocation".equals(lead.getNotINterestedStatus())) {
				leadDto.setNotINterestedStatus(NotInterestedStatus.IrrelevantLocation.name());
			} else if ("Notreachable".equals(lead.getNotINterestedStatus())) {
				leadDto.setNotINterestedStatus(NotInterestedStatus.Notreachable.name());
			} else if ("NotAnswering".equals(lead.getNotINterestedStatus())) {
				leadDto.setNotINterestedStatus(NotInterestedStatus.NotAnswering.name());
			} else if ("Allreadypurchased".equals(lead.getNotINterestedStatus())) {
				leadDto.setNotINterestedStatus(NotInterestedStatus.Allreadypurchased.name());
			} else if ("AlreadyintouchwithCompanyEmployee".equals(lead.getNotINterestedStatus())) {
				leadDto.setNotINterestedStatus(NotInterestedStatus.AlreadyintouchwithCompanyEmployee.name());
			}
		}

		if (lead.getPropertyType() != null) {
			if ("PLOT".equals(lead.getPropertyType())) {
				leadDto.setPropertyType(PropertyType.PLOT.name());
			} else if ("FLAT".equals(lead.getPropertyType())) {
				leadDto.setPropertyType(PropertyType.FLAT.name());
			} else if ("COMMERCIAL".equals(lead.getPropertyType())) {
				leadDto.setPropertyType(PropertyType.COMMERCIAL.name());
			}
		}

		if (lead.getSubPropetyType() != null) {
			if ("Gated".equals(lead.getSubPropetyType().name())) {
				leadDto.setSubPropertyType(SubPropetyType.Gated.name());
			} else if ("Standalone".equals(lead.getSubPropetyType().name())) {
				leadDto.setSubPropertyType(SubPropetyType.Standalone.name());
			} else if ("Resale".equals(lead.getSubPropetyType().name())) {
				leadDto.setSubPropertyType(SubPropetyType.Resale.name());
			} else if ("farmland".equals(lead.getSubPropetyType().name())) {
				leadDto.setSubPropertyType(SubPropetyType.farmland.name());
			} else if ("DTCP".equals(lead.getSubPropetyType().name())) {
				leadDto.setSubPropertyType(SubPropetyType.DTCP.name());
			}

			else if ("HMDA".equals(lead.getSubPropetyType().name())) {
				leadDto.setSubPropertyType(SubPropetyType.HMDA.name());
			} else if ("Office".equals(lead.getSubPropetyType().name())) {
				leadDto.setSubPropertyType(SubPropetyType.Office.name());
			} else if ("Retail".equals(lead.getSubPropetyType().name())) {
				leadDto.setSubPropertyType(SubPropetyType.Retail.name());
			}
		}

		if (lead.getSalesPipeline() != null) {
			if ("OPEN".equals(lead.getSalesPipeline().getName())) {
				leadDto.setSalesPipeline(SalesPipeline.OPEN.name());
			} else if ("COLD_CALLING_MEETING".equals(lead.getSalesPipeline().getName())) {
				leadDto.setSalesPipeline(SalesPipeline.COLDCALLING.name());
			} else if ("PROPOSAL".equals(lead.getSalesPipeline().getName())) {
				leadDto.setSalesPipeline(SalesPipeline.PROPOSAL.name());
			}

			else if ("NEGOTIATION".equals(lead.getSalesPipeline().getName())) {
				leadDto.setSalesPipeline(SalesPipeline.NEGOTIATION.name());
			} else if ("DEALS_OFFERED".equals(lead.getSalesPipeline().getName())) {
				leadDto.setSalesPipeline(SalesPipeline.DEALSOFFERED.name());
			} else if ("CLOSURE".equals(lead.getSalesPipeline().getName())) {
				leadDto.setSalesPipeline(SalesPipeline.CLOSURE.name());
			} else if ("CONVERSION".equals(lead.getSalesPipeline().getName())) {
				leadDto.setSalesPipeline(SalesPipeline.CONVERSION.name());
			}
		}
		
		if (lead.getPlantodo() != null) {
			if ("F2F".equals(lead.getPlantodo().name())) {
				leadDto.setPlantodo(VisitType.F2F.name());
			} else if ("SiteVisit".equals(lead.getPlantodo().name())) {
				leadDto.setPlantodo(VisitType.SiteVisit.name());
			} else if ("Calls".equals(lead.getPlantodo().name())) {
				leadDto.setPlantodo(VisitType.Calls.name());
			} else if ("ClosureMeeting".equals(lead.getPlantodo().name())) {
				leadDto.setPlantodo(VisitType.ClosureMeeting.name());
			}
		}

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

		leadDto.setClientInterested(lead.isClientInterested());
		leadDto.setCrossSegmentLeads(lead.isCrossSegmentLeads());
		leadDto.setComments(lead.getComments());
		leadDto.setCrossSegments(lead.getCrossSegments());

		if (lead.getNotINterestedStatus() != null) {
			if ("IrrelevantLocation".equals(lead.getNotINterestedStatus())) {
				leadDto.setNotINterestedStatus(NotInterestedStatus.IrrelevantLocation.name());
			} else if ("Notreachable".equals(lead.getNotINterestedStatus())) {
				leadDto.setNotINterestedStatus(NotInterestedStatus.Notreachable.name());
			} else if ("NotAnswering".equals(lead.getNotINterestedStatus())) {
				leadDto.setNotINterestedStatus(NotInterestedStatus.NotAnswering.name());
			} else if ("Allreadypurchased".equals(lead.getNotINterestedStatus())) {
				leadDto.setNotINterestedStatus(NotInterestedStatus.Allreadypurchased.name());
			} else if ("AlreadyintouchwithCompanyEmployee".equals(lead.getNotINterestedStatus())) {
				leadDto.setNotINterestedStatus(NotInterestedStatus.AlreadyintouchwithCompanyEmployee.name());
			}
		}

		if (lead.getPropertyType() != null) {
			if ("PLOT".equals(lead.getPropertyType())) {
				leadDto.setPropertyType(PropertyType.PLOT.name());
			} else if ("FLAT".equals(lead.getPropertyType())) {
				leadDto.setPropertyType(PropertyType.FLAT.name());
			} else if ("COMMERCIAL".equals(lead.getPropertyType())) {
				leadDto.setPropertyType(PropertyType.COMMERCIAL.name());
			}
		}

		if (lead.getSubPropetyType() != null) {
			if ("Gated".equals(lead.getSubPropetyType().name())) {
				leadDto.setSubPropertyType(SubPropetyType.Gated.name());
			} else if ("Standalone".equals(lead.getSubPropetyType().name())) {
				leadDto.setSubPropertyType(SubPropetyType.Standalone.name());
			} else if ("Resale".equals(lead.getSubPropetyType().name())) {
				leadDto.setSubPropertyType(SubPropetyType.Resale.name());
			} else if ("farmland".equals(lead.getSubPropetyType().name())) {
				leadDto.setSubPropertyType(SubPropetyType.farmland.name());
			} else if ("DTCP".equals(lead.getSubPropetyType().name())) {
				leadDto.setSubPropertyType(SubPropetyType.DTCP.name());
			}

			else if ("HMDA".equals(lead.getSubPropetyType().name())) {
				leadDto.setSubPropertyType(SubPropetyType.HMDA.name());
			} else if ("Office".equals(lead.getSubPropetyType().name())) {
				leadDto.setSubPropertyType(SubPropetyType.Office.name());
			} else if ("Retail".equals(lead.getSubPropetyType().name())) {
				leadDto.setSubPropertyType(SubPropetyType.Retail.name());
			}
		}

		if (lead.getSalesPipeline() != null) {
			if ("OPEN".equals(lead.getSalesPipeline().getName())) {
				leadDto.setSalesPipeline(SalesPipeline.OPEN.name());
			} else if ("COLD_CALLING_MEETING".equals(lead.getSalesPipeline().getName())) {
				leadDto.setSalesPipeline(SalesPipeline.COLDCALLING.name());
			} else if ("PROPOSAL".equals(lead.getSalesPipeline().getName())) {
				leadDto.setSalesPipeline(SalesPipeline.PROPOSAL.name());
			}

			else if ("NEGOTIATION".equals(lead.getSalesPipeline().getName())) {
				leadDto.setSalesPipeline(SalesPipeline.NEGOTIATION.name());
			} else if ("DEALS_OFFERED".equals(lead.getSalesPipeline().getName())) {
				leadDto.setSalesPipeline(SalesPipeline.DEALSOFFERED.name());
			} else if ("CLOSURE".equals(lead.getSalesPipeline().getName())) {
				leadDto.setSalesPipeline(SalesPipeline.CLOSURE.name());
			} else if ("CONVERSION".equals(lead.getSalesPipeline().getName())) {
				leadDto.setSalesPipeline(SalesPipeline.CONVERSION.name());
			}
		}
		
		if (lead.getPlantodo() != null) {
			if ("F2F".equals(lead.getPlantodo().name())) {
				leadDto.setPlantodo(VisitType.F2F.name());
			} else if ("SiteVisit".equals(lead.getPlantodo().name())) {
				leadDto.setPlantodo(VisitType.SiteVisit.name());
			} else if ("Calls".equals(lead.getPlantodo().name())) {
				leadDto.setPlantodo(VisitType.Calls.name());
			} else if ("ClosureMeeting".equals(lead.getPlantodo().name())) {
				leadDto.setPlantodo(VisitType.ClosureMeeting.name());
			}
		}
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

		lead.setClientInterested(leadDto.isClientInterested());
		lead.setCrossSegmentLeads(leadDto.isCrossSegmentLeads());
		lead.setComments(leadDto.getComments());
		lead.setCrossSegments(leadDto.getCrossSegments());

		if (leadDto.getNotINterestedStatus() != null) {
			if ("IrrelevantLocation".equals(leadDto.getNotINterestedStatus())) {
				lead.setNotINterestedStatus(NotInterestedStatus.IrrelevantLocation);
			} else if ("Notreachable".equals(leadDto.getNotINterestedStatus())) {
				lead.setNotINterestedStatus(NotInterestedStatus.Notreachable);
			} else if ("NotAnswering".equals(leadDto.getNotINterestedStatus())) {
				lead.setNotINterestedStatus(NotInterestedStatus.NotAnswering);
			} else if ("Allreadypurchased".equals(leadDto.getNotINterestedStatus())) {
				lead.setNotINterestedStatus(NotInterestedStatus.Allreadypurchased);
			} else if ("AlreadyintouchwithCompanyEmployee".equals(leadDto.getNotINterestedStatus())) {
				lead.setNotINterestedStatus(NotInterestedStatus.AlreadyintouchwithCompanyEmployee);
			}
		}

		if (leadDto.getPropertyType() != null) {
			if ("PLOT".equals(leadDto.getPropertyType())) {
				lead.setPropertyType(PropertyType.PLOT);
			} else if ("FLAT".equals(leadDto.getPropertyType())) {
				lead.setPropertyType(PropertyType.FLAT);
			} else if ("COMMERCIAL".equals(leadDto.getPropertyType())) {
				lead.setPropertyType(PropertyType.COMMERCIAL);
			}
		}

		if (leadDto.getSubPropertyType() != null) {
			if ("Gated".equals(leadDto.getSubPropertyType())) {
				lead.setSubPropetyType(SubPropetyType.Gated);
			} else if ("Standalone".equals(leadDto.getSubPropertyType())) {
				lead.setSubPropetyType(SubPropetyType.Standalone);
			} else if ("Resale".equals(leadDto.getSubPropertyType())) {
				lead.setSubPropetyType(SubPropetyType.Resale);
			} else if ("farmland".equals(leadDto.getSubPropertyType())) {
				lead.setSubPropetyType(SubPropetyType.farmland);
			} else if ("DTCP".equals(leadDto.getSubPropertyType())) {
				lead.setSubPropetyType(SubPropetyType.DTCP);
			}

			else if ("HMDA".equals(leadDto.getSubPropertyType())) {
				lead.setSubPropetyType(SubPropetyType.HMDA);
			} else if ("Office".equals(leadDto.getSubPropertyType())) {
				lead.setSubPropetyType(SubPropetyType.Office);
			} else if ("Retail".equals(leadDto.getSubPropertyType())) {
				lead.setSubPropetyType(SubPropetyType.Retail);
			}
		}

		if (leadDto.getSalesPipeline() != null) {
			if ("OPEN".equals(leadDto.getSalesPipeline())) {
				lead.setSalesPipeline(SalesPipeline.OPEN);
			} else if ("COLD_CALLING_MEETING".equals(leadDto.getSalesPipeline())) {
				lead.setSalesPipeline(SalesPipeline.COLDCALLING);
			} else if ("PROPOSAL".equals(leadDto.getSalesPipeline())) {
				lead.setSalesPipeline(SalesPipeline.PROPOSAL);
			}

			else if ("NEGOTIATION".equals(leadDto.getSalesPipeline())) {
				lead.setSalesPipeline(SalesPipeline.NEGOTIATION);
			} else if ("DEALS_OFFERED".equals(leadDto.getSalesPipeline())) {
				lead.setSalesPipeline(SalesPipeline.DEALSOFFERED);
			} else if ("CLOSURE".equals(leadDto.getSalesPipeline())) {
				lead.setSalesPipeline(SalesPipeline.CLOSURE);
			} else if ("CONVERSION".equals(leadDto.getSalesPipeline())) {
				lead.setSalesPipeline(SalesPipeline.CONVERSION);
			}
		}
		
		if (leadDto.getPlantodo() != null) {
			if ("F2F".equals(leadDto.getPlantodo())) {
				lead.setPlantodo(VisitType.F2F);
			} else if ("SiteVisit".equals(leadDto.getPlantodo())) {
				lead.setPlantodo(VisitType.SiteVisit);
			} else if ("Calls".equals(leadDto.getPlantodo())) {
				lead.setPlantodo(VisitType.Calls);
			} else if ("ClosureMeeting".equals(leadDto.getPlantodo())) {
				lead.setPlantodo(VisitType.ClosureMeeting);
			}
		}
		return lead;
	}
}
