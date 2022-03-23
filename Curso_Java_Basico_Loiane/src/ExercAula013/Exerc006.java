package ExercAula013;

import java.util.Scanner;

public class Exerc006 {

	public static void main(String[] args) {
		/* 6. Faça um Programa que peça o raio de um círculo,
		calcule e mostre sua área.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o raio de um círculo:");
		double num = entrada.nextDouble();
		
		double arae = Math.PI * Math.pow(num, 2);
		
		System.out.println("O raio vale "+num+ " e sua área: "+arae+" m²");
		entrada.close();

	}

}
