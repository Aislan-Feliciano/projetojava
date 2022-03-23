package ExercAula015;

import java.util.Scanner;

public class Exerc009 {

	public static void main(String[] args) {
		/* 9. Faça um Programa que leia três números e 
		 * mostre-os em ordem decrescente. */ 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o primeiro número:");
		double num1 = entrada.nextDouble();
		
		System.out.println("digite o segundo número:");
		double num2 = entrada.nextDouble();
		
		System.out.println("digite o terceiro número:");
		double num3 = entrada.nextDouble();
		
		if(num1<=num2 && num1<=num3 && num2<=num3) {			
			System.out.println(num3+ " - " +num2+ " - "  +num1);
		}
		else if(num1<=num2 && num1<=num3 && num3<=num2) {
			System.out.println(num2+ " - " +num3+ " - "  +num1);
		}		
		else if(num2<=num1 &&  num2<=num3 && num1<=num3) {
			System.out.println(num3+ " - " +num1+ " - " +num2);
		}
		else if(num2<=num1 &&  num2<=num3 && num3<=num1) {
			System.out.println(num1+ " - " +num3+ " - " +num2);
		}
		else if(num3<=num1 &&  num3<= num2 && num1<=num2) {
			System.out.println(num2+ " - " +num1+ " - " +num3);
		}
		else if(num3<=num1 &&  num3<= num2 && num2<=num1) {
			System.out.println( num1+ " - " +num2+ " - " +num3);
		}
		entrada.close();
	}

}
