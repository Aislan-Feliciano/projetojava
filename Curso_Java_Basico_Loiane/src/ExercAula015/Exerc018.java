package ExercAula015;

import java.util.Scanner;

public class Exerc018 {

	public static void main(String[] args) {
		/* 18.Fa�a um Programa que pe�a um n�mero inteiro e determine se ele � par ou impar. 
		  Dica: utilize o operador m�dulo (resto da divis�o). */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�nero:");
		int num = entrada.nextInt();
		
		if(num % 2 == 0 ) {
			System.out.println("O n�mero � par!");
		}else {
			System.out.println("O n�mero � �mpar!");
		}
		entrada.close();

	}

}
