package ExercAula013;

import java.util.Scanner;

public class Exerc011 {

	public static void main(String[] args) {
		/*11.Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real.
		 Calcule e mostre: a. o produto do dobro do primeiro com metade do segundo .
		  b. a soma do triplo do primeiro com o terceiro. c. o terceiro elevado ao cubo.*/

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro:");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite outro n�mero inteiro:");
		int num2 = entrada.nextInt();
		
		System.out.println("Digite um n�mero real:");
		double num3 = entrada.nextDouble();
		
		int a = (num1 * 2) * (num2 / 2);
		double b = (num1 * 3) + num3;
		double c = Math.pow(num3, 3);
		
		 System.out.println("A soma de a �: " + a);
		 System.out.println("A soma de b �: " + b);
		 System.out.println("A soma de c �: " + c);
		
		
		
		
	}

}
