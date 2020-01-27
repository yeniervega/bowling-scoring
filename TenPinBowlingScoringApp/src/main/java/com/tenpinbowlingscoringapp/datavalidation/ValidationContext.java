package com.tenpinbowlingscoringapp.datavalidation;

public class ValidationContext {
	
	private Validation validation;

	public ValidationContext(Validation validation) {
		super();
		this.validation = validation;
	}
	
	public String Validate(Object object) {
		return validation.Validate(object);
	}

}
