package ExercAula013;

import java.util.Scanner;

public class Exerc006 {

	public static void main(String[] args) {
		/* 6. Fa�a um Programa que pe�a o raio de um c�rculo,
		calcule e mostre sua �rea.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o raio de um c�rculo:");
		double num = entrada.nextDouble();
		
		double arae = Math.PI * Math.pow(num, 2);
		
		System.out.println("O raio vale "+num+ " e sua �rea: "+arae+" m�");
		entrada.close();

	}

}
