package com.bricktobrick.B2BConnect.services;

import java.util.List;

import com.bricktobrick.B2BConnect.dtos.DealsDto;

public interface DealsService {

	void createDeals(DealsDto dealsDto);

	List<DealsDto> findAllDeals();

	DealsDto findDealsById(Long id);

	void updateDeals(Long id, DealsDto dealsDto);

	void deleteDeals(Long id);

}
