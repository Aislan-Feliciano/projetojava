package ExercAula013;

import java.util.Scanner;

public class Exerc005 {

	public static void main(String[] args) {
		
		//5. Fa�a um Programa que converta metros para cent�metros.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um n�mero:");
		double num = entrada.nextDouble();
		double cent = num * 100;
		
		System.out.println("O n�mero digitado "+ num+ " corresponde: "+ cent+ " cm");
		

	}

}
