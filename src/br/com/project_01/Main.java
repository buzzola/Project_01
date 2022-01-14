package br.com.project_01;
import java.util.Locale;
import java.util.Scanner;
import br.com.utils.Calculator;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Project_01");
		System.out.println("Esse programa verifica qual bloco teve um valor maior na soma dos 3 numeros digitados");
		System.out.println("-------------------------------------------------------");
		
		
		
		//Pega os dados do P1.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		System.out.println("Digite o primeiro numero do bloco 1");
		calculator.p1a = sc.nextDouble();
		
		System.out.println("Digite o segundo numero do bloco 1");
		calculator.p1b = sc.nextDouble();
		
		System.out.println("Digite o terceiro numero do bloco 1");
		calculator.p1c = sc.nextDouble();
		
		System.out.println("Agora insira os dados do bloco 2");
		
		//Pega os dados do P2.
		calculator.p2a = sc.nextDouble();
		System.out.println("Digite o primeiro numero do bloco 2");
		
		calculator.p2b = sc.nextDouble();
		System.out.println("Digite o segundo numero do bloco 2");
		
		calculator.p2c = sc.nextDouble();
		System.out.println("Digite o terceiro numero do bloco 2");
		sc.close();
		
		
		//Printa qual bloco teve a soma maior
		calculator.howBigger();
		System.out.println("BLOCO 1: "+ calculator.calculatorP1());
		System.out.println("BLOCO 2: "+ calculator.calculatorP2());

		
		
		
		
		
		
		

	}

}
