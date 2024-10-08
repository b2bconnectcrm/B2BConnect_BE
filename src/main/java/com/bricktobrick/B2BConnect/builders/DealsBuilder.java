package com.bricktobrick.B2BConnect.builders;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bricktobrick.B2BConnect.dtos.DealsDto;
import com.bricktobrick.B2BConnect.entity.Deals;

@Component
public class DealsBuilder {

	public Deals convertToModel(DealsDto dealsDto) {

		Deals deals = new Deals();
		deals.setAccountName(dealsDto.getAccountName());
		deals.setAmount(dealsDto.getAmount());

		deals.setClientName(dealsDto.getClientName());
		deals.setClosingDate(dealsDto.getClosingDate());
		deals.setCommissionPercent(dealsDto.getCommissionPercent());
		;
		deals.setDealName(dealsDto.getDealName());
		deals.setForcastCategory(dealsDto.getForcastCategory());

		deals.setId(dealsDto.getId());
		deals.setPancardFilePath(dealsDto.getPancardFilePath());

		deals.setPancardNumber(dealsDto.getPancardNumber());
		deals.setPhone(dealsDto.getPhone());
		// deals.setProjectType(dealsDto.getProjectType());

		deals.setReferredBy(dealsDto.getReferredBy());
		// deals.setSalesPipeline(dealsDto.getSalesPipeline());
		deals.setStage(dealsDto.getStage());

		deals.setSubProjectType(dealsDto.getSubProjectType());
		// deals.setUnitStatus(dealsDto.getUnitStatus());
		// deals.setLead(dealsDto.getLeadDto());
		// deals.setEmployee(dealsDto.getEmployeeDto());

		return deals;

	}

	public List<DealsDto> convertList(List<Deals> deals) {
		// TODO Auto-generated method stub
		List<DealsDto> dtos= new ArrayList<>();
		if(deals != null && deals.size() > 0) {
			deals.forEach(deal ->{
				dtos.add(convertToDto(deal));
			});
		}
		return dtos;
	}

	public DealsDto convertToDto(Deals deal) {
		// TODO Auto-generated method stub
		DealsDto dto = new DealsDto();
		dto.setAccountName(deal.getAccountName());
		dto.setAmount(deal.getAmount());

		dto.setClientName(deal.getClientName());
		dto.setClosingDate(deal.getClosingDate());
		dto.setCommissionPercent(deal.getCommissionPercent());
		;
		dto.setDealName(deal.getDealName());
		dto.setForcastCategory(deal.getForcastCategory());

		dto.setId(deal.getId());
		dto.setPancardFilePath(deal.getPancardFilePath());

		dto.setPancardNumber(deal.getPancardNumber());
		dto.setPhone(deal.getPhone());
		// dto.setProjectType(deal.getProjectType());

		dto.setReferredBy(deal.getReferredBy());
		// dto.setSalesPipeline(deal.getSalesPipeline());
		dto.setStage(deal.getStage());

		dto.setSubProjectType(deal.getSubProjectType());
		// dto.setUnitStatus(deal.getUnitStatus());
		// dto.setLead(deal.getLeadDto());
		// dto.setEmployee(deal.getEmployeeDto());

		return dto;
	}

	public Deals convertDtotoModel(Deals deals, DealsDto dealsDto) {
		if(deals != null && dealsDto != null) {
			deals.setAccountName(dealsDto.getAccountName());
			deals.setAmount(dealsDto.getAmount());

			deals.setClientName(dealsDto.getClientName());
			deals.setClosingDate(dealsDto.getClosingDate());
			deals.setCommissionPercent(dealsDto.getCommissionPercent());
			;
			deals.setDealName(dealsDto.getDealName());
			deals.setForcastCategory(dealsDto.getForcastCategory());

			deals.setId(dealsDto.getId());
			deals.setPancardFilePath(dealsDto.getPancardFilePath());

			deals.setPancardNumber(dealsDto.getPancardNumber());
			deals.setPhone(dealsDto.getPhone());
			// deals.setProjectType(dealsDto.getProjectType());

			deals.setReferredBy(dealsDto.getReferredBy());
			// deals.setSalesPipeline(dealsDto.getSalesPipeline());
			deals.setStage(dealsDto.getStage());

			deals.setSubProjectType(dealsDto.getSubProjectType());
			// deals.setUnitStatus(dealsDto.getUnitStatus());
			// deals.setLead(dealsDto.getLeadDto());
			// deals.setEmployee(dealsDto.getEmployeeDto());
			
		}
		
		
		return deals;
		
	}

}
