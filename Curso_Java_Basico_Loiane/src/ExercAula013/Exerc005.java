package ExercAula013;

import java.util.Scanner;

public class Exerc005 {

	public static void main(String[] args) {
		
		//5. Faça um Programa que converta metros para centímetros.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um número:");
		double num = entrada.nextDouble();
		double cent = num * 100;
		
		System.out.println("O número digitado "+ num+ " corresponde: "+ cent+ " cm");
		

	}

}
