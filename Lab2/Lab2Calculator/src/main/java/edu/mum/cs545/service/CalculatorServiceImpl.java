package edu.mum.cs545.service;


import edu.mum.cs545.domain.Calculator;

public class CalculatorServiceImpl implements CalculatorService  {

	
	
	public void add(Calculator calculator){
		calculator.add();
		
		return ;
	}
	
	public void mult(Calculator calculator){
		calculator.mult();

		return ;
	}
 
}
