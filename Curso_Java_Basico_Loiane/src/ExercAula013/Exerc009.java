package ExercAula013;

import java.util.Scanner;

public class Exerc009 {

	public static void main(String[] args) {
		/* 9. Fa�a um Programa que pe�a a temperatura em graus Farenheit,
	    transforme e mostre a temperatura em graus Celsius. o C = (5 * (F-32) / 9). */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("mostre a temperatura em farenheit:");
		double tempFar = scan.nextDouble();
		
		double tempCel = (5 * (tempFar-32) /9);
		
		System.out.println("A temperatura em Celsius �: "+ tempCel);
		scan.close();

	}

}
