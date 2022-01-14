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
		
		System.out.println("Digite o primeiro numero do P1");
		calculator.p1a = sc.nextDouble();
		
		System.out.println("Digite o segundo numero do P1");
		calculator.p1b = sc.nextDouble();
		
		System.out.println("Digite o terceiro numero do P1");
		calculator.p1c = sc.nextDouble();
		
		
		//Pega os dados do P2.
		calculator.p2a = sc.nextDouble();
		System.out.println("Digite o primeiro numero do P2");
		
		calculator.p2b = sc.nextDouble();
		System.out.println("Digite o segundo numero do P2");
		
		calculator.p2c = sc.nextDouble();
		System.out.println("Digite o terceiro numero do P2");
		sc.close();
		
		
		//Printa o valor do bloco 1 e bloco 2 e diz qual foi maior.
			
		calculator.howBigger();
		
		
		
		
		
		
		
		

	}

}
