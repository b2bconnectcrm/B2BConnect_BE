package com.bricktobrick.B2BConnect.builders;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bricktobrick.B2BConnect.dtos.DealsDto;
import com.bricktobrick.B2BConnect.entity.Deals;
import com.bricktobrick.B2BConnect.entity.ProjectType;
import com.bricktobrick.B2BConnect.entity.SalesPipeline;
import com.bricktobrick.B2BConnect.entity.Stage;
import com.bricktobrick.B2BConnect.entity.UnitStatus;

@Component
public class DealsBuilder {

	public Deals convertToModel(DealsDto dealsDto) {

		Deals deals = new Deals();
		deals.setAccountName(dealsDto.getAccountName());
		deals.setAmount(dealsDto.getAmount());

		deals.setClientName(dealsDto.getClientName());
		deals.setClosingDate(dealsDto.getClosingDate());
		deals.setCommissionPercent(dealsDto.getCommissionPercent());
		deals.setDealName(dealsDto.getDealName());
		deals.setForcastCategory(dealsDto.getForcastCategory());

		deals.setId(dealsDto.getId());
		deals.setPancardFilePath(dealsDto.getPancardFilePath());

		deals.setPancardNumber(dealsDto.getPancardNumber());
		deals.setPhone(dealsDto.getPhone());
		deals.setReferredBy(dealsDto.getReferredBy());

		if (dealsDto.getUnitStatus() != null) {
			if (dealsDto.getUnitStatus().equals("Blocked")) {
				deals.setUnitStatus(UnitStatus.Blocked);
			}
			if (dealsDto.getUnitStatus().equals("Sold")) {
				deals.setUnitStatus(UnitStatus.Sold);
			}
		}

		if (dealsDto.getProjectType() != null) {
			if (dealsDto.getProjectType().equals("FLAT")) {
				deals.setProjectType(ProjectType.FLAT);
			}
			if (dealsDto.getProjectType().equals("OPENPLOT")) {
				deals.setProjectType(ProjectType.OPENPLOT);
			}
			if (dealsDto.getProjectType().equals("COMMERCIALSPACE")) {
				deals.setProjectType(ProjectType.COMMERCIALSPACE);
			}
		}

		if (dealsDto.getStage() != null) {

			if (dealsDto.getStage().equals("STARTED")) {
				deals.setStage(Stage.STARTED);
			} else if (dealsDto.getStage().equals("DOWNPAYMENT_STAGE")) {
				deals.setStage(Stage.DOWNPAYMENTSTAGE);
			} else if (dealsDto.getStage().equals("NEGOTIATION")) {
				deals.setStage(Stage.NEGOTIATION);
			} else if (dealsDto.getStage().equals("BOOKING_CONFIRMED")) {
				deals.setStage(Stage.BOOKINGCONFIRMED);
			} else if (dealsDto.getStage().equals("PAYMENT_MILESTONE")) {
				deals.setStage(Stage.PAYMENTMILESTONE);
			} else if (dealsDto.getStage().equals("PAYMENTCOMPLETED")) {
				deals.setStage(Stage.PAYMENTCOMPLETED);
			} else if (dealsDto.getStage().equals("CLOSED_LOST")) {
				deals.setStage(Stage.CLOSEDLOST);
			} else if (dealsDto.getStage().equals("CLOSEDLOST_TO_COMPETITION")) {
				deals.setStage(Stage.CLOSEDLOSTTOCOMPETITION);
			} else if (dealsDto.getStage().equals("POSTPONED_DECISION")) {
				deals.setStage(Stage.POSTPONEDDECISION);
			} else if (dealsDto.getStage().equals("PENDING_FOR_BANKLOAN")) {
				deals.setStage(Stage.PENDINGFORBANKLOAN);
			}
		}

		if (dealsDto.getSalesPipeline() != null) {

			if (dealsDto.getSalesPipeline().equals("OPEN")) {
				deals.setSalesPipeline(SalesPipeline.OPEN);
			} else if (dealsDto.getSalesPipeline().equals("COLD_CALLING_MEETING")) {
				deals.setSalesPipeline(SalesPipeline.COLDCALLING);
			} else if (dealsDto.getSalesPipeline().equals("PROPOSAL")) {
				deals.setSalesPipeline(SalesPipeline.PROPOSAL);
			} else if (dealsDto.getSalesPipeline().equals("NEGOTIATION")) {
				deals.setSalesPipeline(SalesPipeline.NEGOTIATION);
			} else if (dealsDto.getSalesPipeline().equals("DEALS_OFFERED")) {
				deals.setSalesPipeline(SalesPipeline.DEALSOFFERED);
			} else if (dealsDto.getSalesPipeline().equals("CLOSURE")) {
				deals.setSalesPipeline(SalesPipeline.CLOSURE);
			} else if (dealsDto.getSalesPipeline().equals("CONVERSION")) {
				deals.setSalesPipeline(SalesPipeline.CONVERSION);
			}
		}

		return deals;

	}

	public List<DealsDto> convertList(List<Deals> deals) {
		// TODO Auto-generated method stub
		List<DealsDto> dtos = new ArrayList<>();
		if (deals != null && deals.size() > 0) {
			deals.forEach(deal -> {
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

		dto.setReferredBy(deal.getReferredBy());
		if (deal.getUnitStatus() != null) {
			if (deal.getUnitStatus().equals("Blocked")) {
				dto.setUnitStatus(UnitStatus.Blocked.name());
			}
			if (deal.getUnitStatus().equals("Sold")) {
				dto.setUnitStatus(UnitStatus.Sold.name());
			}
		}

		if (deal.getProjectType() != null) {
			if (deal.getProjectType().equals("FLAT")) {
				dto.setProjectType(ProjectType.FLAT.name());
			}
			if (deal.getProjectType().equals("OPENPLOT")) {
				dto.setProjectType(ProjectType.OPENPLOT.name());
			}
			if (deal.getProjectType().equals("COMMERCIALSPACE")) {
				dto.setProjectType(ProjectType.COMMERCIALSPACE.name());
			}
		}

		if (deal.getStage() != null) {

			if (deal.getStage().equals("STARTED")) {
				dto.setStage(Stage.STARTED.getName());
			} else if (deal.getStage().equals("DOWNPAYMENT_STAGE")) {
				dto.setStage(Stage.DOWNPAYMENTSTAGE.getName());
			} else if (deal.getStage().equals("NEGOTIATION")) {
				dto.setStage(Stage.NEGOTIATION.getName());
			} else if (deal.getStage().equals("BOOKING_CONFIRMED")) {
				dto.setStage(Stage.BOOKINGCONFIRMED.getName());
			} else if (deal.getStage().equals("PAYMENT_MILESTONE")) {
				dto.setStage(Stage.PAYMENTMILESTONE.getName());
			} else if (deal.getStage().equals("PAYMENTCOMPLETED")) {
				dto.setStage(Stage.PAYMENTCOMPLETED.getName());
			} else if (deal.getStage().equals("CLOSED_LOST")) {
				dto.setStage(Stage.CLOSEDLOST.getName());
			} else if (deal.getStage().equals("CLOSEDLOST_TO_COMPETITION")) {
				dto.setStage(Stage.CLOSEDLOSTTOCOMPETITION.getName());
			} else if (deal.getStage().equals("POSTPONED_DECISION")) {
				dto.setStage(Stage.POSTPONEDDECISION.getName());
			} else if (deal.getStage().equals("PENDING_FOR_BANKLOAN")) {
				dto.setStage(Stage.PENDINGFORBANKLOAN.getName());
			}
		}

		if (deal.getSalesPipeline() != null) {

			if (deal.getSalesPipeline().equals("OPEN")) {
				dto.setSalesPipeline(SalesPipeline.OPEN.getName());
			} else if (deal.getSalesPipeline().equals("COLD_CALLING_MEETING")) {
				dto.setSalesPipeline(SalesPipeline.COLDCALLING.getName());
			} else if (deal.getSalesPipeline().equals("PROPOSAL")) {
				dto.setSalesPipeline(SalesPipeline.PROPOSAL.getName());
			} else if (deal.getSalesPipeline().equals("NEGOTIATION")) {
				dto.setSalesPipeline(SalesPipeline.NEGOTIATION.getName());
			} else if (deal.getSalesPipeline().equals("DEALS_OFFERED")) {
				dto.setSalesPipeline(SalesPipeline.DEALSOFFERED.getName());
			} else if (deal.getSalesPipeline().equals("CLOSURE")) {
				dto.setSalesPipeline(SalesPipeline.CLOSURE.getName());
			} else if (deal.getSalesPipeline().equals("CONVERSION")) {
				dto.setSalesPipeline(SalesPipeline.CONVERSION.getName());
			}
		}
//		 dto.setLead(deal.getLead());
//		 dto.setEmployee(deal.getEmployeeDto());

		return dto;
	}

	public Deals convertDtotoModel(Deals deals, DealsDto dealsDto) {
		if (deals != null && dealsDto != null) {
			deals.setAccountName(dealsDto.getAccountName());
			deals.setAmount(dealsDto.getAmount());

			deals.setClientName(dealsDto.getClientName());
			deals.setClosingDate(dealsDto.getClosingDate());
			deals.setCommissionPercent(dealsDto.getCommissionPercent());
			deals.setDealName(dealsDto.getDealName());
			deals.setForcastCategory(dealsDto.getForcastCategory());

			deals.setId(dealsDto.getId());
			deals.setPancardFilePath(dealsDto.getPancardFilePath());

			deals.setPancardNumber(dealsDto.getPancardNumber());
			deals.setPhone(dealsDto.getPhone());

			deals.setReferredBy(dealsDto.getReferredBy());
			if (dealsDto.getUnitStatus() != null) {
				if (dealsDto.getUnitStatus().equals("Blocked")) {
					deals.setUnitStatus(UnitStatus.Blocked);
				}
				if (dealsDto.getUnitStatus().equals("Sold")) {
					deals.setUnitStatus(UnitStatus.Sold);
				}
			}

			if (dealsDto.getProjectType() != null) {
				if (dealsDto.getProjectType().equals("FLAT")) {
					deals.setProjectType(ProjectType.FLAT);
				}
				if (dealsDto.getProjectType().equals("OPENPLOT")) {
					deals.setProjectType(ProjectType.OPENPLOT);
				}
				if (dealsDto.getProjectType().equals("COMMERCIALSPACE")) {
					deals.setProjectType(ProjectType.COMMERCIALSPACE);
				}
			}

			if (dealsDto.getStage() != null) {

				if (dealsDto.getStage().equals("STARTED")) {
					deals.setStage(Stage.STARTED);
				} else if (dealsDto.getStage().equals("DOWNPAYMENT_STAGE")) {
					deals.setStage(Stage.DOWNPAYMENTSTAGE);
				} else if (dealsDto.getStage().equals("NEGOTIATION")) {
					deals.setStage(Stage.NEGOTIATION);
				} else if (dealsDto.getStage().equals("BOOKING_CONFIRMED")) {
					deals.setStage(Stage.BOOKINGCONFIRMED);
				} else if (dealsDto.getStage().equals("PAYMENT_MILESTONE")) {
					deals.setStage(Stage.PAYMENTMILESTONE);
				} else if (dealsDto.getStage().equals("PAYMENTCOMPLETED")) {
					deals.setStage(Stage.PAYMENTCOMPLETED);
				} else if (dealsDto.getStage().equals("CLOSED_LOST")) {
					deals.setStage(Stage.CLOSEDLOST);
				} else if (dealsDto.getStage().equals("CLOSEDLOST_TO_COMPETITION")) {
					deals.setStage(Stage.CLOSEDLOSTTOCOMPETITION);
				} else if (dealsDto.getStage().equals("POSTPONED_DECISION")) {
					deals.setStage(Stage.POSTPONEDDECISION);
				} else if (dealsDto.getStage().equals("PENDING_FOR_BANKLOAN")) {
					deals.setStage(Stage.PENDINGFORBANKLOAN);
				}
			}

			if (dealsDto.getSalesPipeline() != null) {

				if (dealsDto.getSalesPipeline().equals("OPEN")) {
					deals.setSalesPipeline(SalesPipeline.OPEN);
				} else if (dealsDto.getSalesPipeline().equals("COLD_CALLING_MEETING")) {
					deals.setSalesPipeline(SalesPipeline.COLDCALLING);
				} else if (dealsDto.getSalesPipeline().equals("PROPOSAL")) {
					deals.setSalesPipeline(SalesPipeline.PROPOSAL);
				} else if (dealsDto.getSalesPipeline().equals("NEGOTIATION")) {
					deals.setSalesPipeline(SalesPipeline.NEGOTIATION);
				} else if (dealsDto.getSalesPipeline().equals("DEALS_OFFERED")) {
					deals.setSalesPipeline(SalesPipeline.DEALSOFFERED);
				} else if (dealsDto.getSalesPipeline().equals("CLOSURE")) {
					deals.setSalesPipeline(SalesPipeline.CLOSURE);
				} else if (dealsDto.getSalesPipeline().equals("CONVERSION")) {
					deals.setSalesPipeline(SalesPipeline.CONVERSION);
				}
			}
			;

		}

		return deals;

	}

}
