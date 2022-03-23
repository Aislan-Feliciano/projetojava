package ExercAula013;

import java.util.Scanner;

public class Exerc010 {

	public static void main(String[] args) {
		/* 10.Faça um Programa que peça a temperatura em graus Celsius,
		  transforme e mostre em graus Farenheit. C = (5 * (F-32) / 9).*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Mostre a temperatura em Celsius:");
		double C = entrada.nextDouble();
		
		double F = (C * 1.8) + 32;
		
	    System.out.println("A tempratura em Farenheit é "+ F);
	    entrada.close();

	}

}
