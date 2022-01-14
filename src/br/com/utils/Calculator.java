package br.com.utils;

public class Calculator {
	
	
	//p1. = bloco 1
	public double p1a;
	public double p1b;
	public double p1c;

	
	//p2. = bloco 2
	public double p2a;
	public double p2b;
	public double p2c;
	
	
	//Calcula o valor do bloco p1.
	public double calculatorP1() {
		
		return p1a + p1b + p1c;
	}
	
	//Calcula o valor do bloco p2.
	public double calculatorP2() {
		
		return p2a + p2b + p2c;
	}

	
	//Calcula qual bloco teve o maior valor.
	public void howBigger() {
		
		
		if (calculatorP1() > calculatorP2()) {
			System.out.println("O primeiro bloco teve um numero maior na soma total.");
			
		} else if (calculatorP1() == calculatorP2()) {
			System.out.println("O bloco 1 e 2 teve o mesmo valor");
			
		} else if (calculatorP1() < calculatorP2()) {
			System.out.println("O segundo bloco teve um numero maior na soma total");
			
		}
		
	}
	

	

} // final
