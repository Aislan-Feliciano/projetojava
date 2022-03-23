package ExercAula015;

import java.util.Scanner;

public class Exerc018 {

	public static void main(String[] args) {
		/* 18.Faça um Programa que peça um número inteiro e determine se ele é par ou impar. 
		  Dica: utilize o operador módulo (resto da divisão). */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um núnero:");
		int num = entrada.nextInt();
		
		if(num % 2 == 0 ) {
			System.out.println("O número é par!");
		}else {
			System.out.println("O número é ímpar!");
		}
		entrada.close();

	}

}
