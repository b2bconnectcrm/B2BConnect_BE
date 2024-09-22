package com.bricktobrick.B2BConnect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bricktobrick.B2BConnect.dtos.LeadDto;
import com.bricktobrick.B2BConnect.services.LeadService;

@RestController
@RequestMapping(value = "/lead")
@CrossOrigin
public class LeadController {
	
	@Autowired
	private LeadService leadService;

	@PostMapping(value = "/add")
	public void addLead(@RequestBody LeadDto leadDto) {
		leadService.addLead(leadDto);
	}
	
	@GetMapping(value = "/all")
	public List<LeadDto> findAllLeads() {
		return leadService.findAllLeads();
	}
	
	@GetMapping(value = "/{id}")
	public LeadDto findLead(@PathVariable(value = "id") Long id) {
		return leadService.findLead(id);
	}

	@PutMapping(value = "/{id}")
	public void updateLead(@PathVariable(value = "id") Long id, @RequestBody LeadDto leadDto) {
		leadService.updateLead(id, leadDto);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteLead(@PathVariable(value = "id") Long id) {
		 leadService.deleteLead(id);
	}

	

}
