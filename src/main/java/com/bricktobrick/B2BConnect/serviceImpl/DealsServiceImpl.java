package com.bricktobrick.B2BConnect.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bricktobrick.B2BConnect.builders.DealsBuilder;
import com.bricktobrick.B2BConnect.common.CommonException;
import com.bricktobrick.B2BConnect.common.CommonExceptionMessage;
import com.bricktobrick.B2BConnect.dtos.DealsDto;
import com.bricktobrick.B2BConnect.entity.Deals;
import com.bricktobrick.B2BConnect.repository.DealsRepository;
import com.bricktobrick.B2BConnect.services.DealsService;

@Service
public class DealsServiceImpl implements DealsService {

	@Autowired
	private DealsRepository dealsRepository;

	@Autowired
	private DealsBuilder dealsBuilder;

	@Override
	public void createDeals(DealsDto dealsDto) {
		// TODO Auto-generated method stub
		Deals deals = dealsBuilder.convertToModel(dealsDto);
		if (deals != null) {
			dealsRepository.save(deals);
		}
	}

	@Override
	public List<DealsDto> findAllDeals() {
		// TODO Auto-generated method stub
		List<Deals> deals = dealsRepository.findAll();
		List<DealsDto> dealsDtos = dealsBuilder.convertList(deals);
		return dealsDtos;
	}

	@Override
	public DealsDto findDealsById(Long id) {
		// TODO Auto-generated method stub
		DealsDto dbDealsDto = null;
		Optional<Deals> optional = dealsRepository.findById(id);
		if (optional.isPresent()) {
			dbDealsDto = dealsBuilder.convertToDto(optional.get());
		}
		return dbDealsDto;
	}

	@Override
	public void updateDeals(Long id, DealsDto dealsDto) {
		// TODO Auto-generated method stub
		Deals dbDeals = null;
		Optional<Deals> optional = dealsRepository.findById(id);
		if (optional.isPresent()) {
			dbDeals = optional.get();
		} else {
			throw CommonException.createException(CommonExceptionMessage.NOT_FOUND, dbDeals.getDealName());
		}
		Deals deals = dealsBuilder.convertDtotoModel(dbDeals, dealsDto);

		dealsRepository.save(deals);
	}

	@Override
	public void deleteDeals(Long id) {
		// TODO Auto-generated method stub
		dealsRepository.deleteById(id);
	}

}
