package com.bricktobrick.B2BConnect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bricktobrick.B2BConnect.dtos.DealsDto;
import com.bricktobrick.B2BConnect.services.DealsService;

@RestController
@RequestMapping(value = "/deals")
public class DealsController {
	
	@Autowired
	private DealsService dealsService;
	
	@PostMapping(value = "/add")
	private void createDeals(@RequestBody DealsDto dealsDto) {
		dealsService.createDeals(dealsDto);
	}
	
	@GetMapping(value = "/all")
	private List<DealsDto> findAllDeals() {
		return dealsService.findAllDeals();
	}
	
	@GetMapping(value = "/one/{id}")
	private DealsDto findDealsById(@PathVariable(value = "id") Long id) {
		return dealsService.findDealsById(id);
	}
	
	@PutMapping(value = "/{id}")
	private void updateDeals(@PathVariable(value = "id") Long id,  @RequestBody DealsDto dealsDto) {
		dealsService.updateDeals(id,dealsDto);
	}
	
	@DeleteMapping(value = "/{id}")
	private void deleteDeals(@PathVariable(value = "id") Long id) {
		 dealsService.deleteDeals(id);
	}

}
