package com.bricktobrick.B2BConnect.entity;

public enum LeadSource {
	COMPANYLEAD("COMPANY_LEAD", "Company Lead"), OWNLEAD("OWN_LEAD", "Self Lead"),
	SHAREDLEAD("SHARED_LEAD", "Shared Lead"), COLDCALLLEAD("COLDCALLL_LEAD", "Cold Call Lead"),
	CPLEAD("CP_LEAD", "cp Lead");

	private final String name;
	private final String description;

	// Constructor
	LeadSource(String name, String description) {
		this.name = name;
		this.description = description;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Getter for description
	public String getDescription() {
		return description;
	}

}
