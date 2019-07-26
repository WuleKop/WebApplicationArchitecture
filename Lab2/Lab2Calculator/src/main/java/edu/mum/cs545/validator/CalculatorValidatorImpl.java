package edu.mum.cs545.validator;

import java.util.ArrayList;
import java.util.List;

import edu.mum.cs545.domain.Calculator;

public class CalculatorValidatorImpl implements CalculatorValidator {
	
	public List<String> validate(Object  object ) {
		List<String> errors = new ArrayList<String>();
		
		Calculator calculator = (Calculator) object;

 		
	 	if (calculator.getAdd1() == null) {
			errors.add("Add1 must have a value");
		} 
			
 		if (calculator.getAdd2() == null) {
			errors.add("Add2 must have a value");
		} 
 		if (calculator.getMult1() == null) {
			errors.add("Mult1 must have a value");
		} 
		
 		if (calculator.getMult2() == null) {
			errors.add("Mult2 must have a value");
		} 
		
		
		return errors;
	}
}
