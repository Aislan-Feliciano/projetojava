package ExercAula015;

import java.util.Scanner;

public class Exerc007 {

	public static void main(String[] args) {
		/*. 7. Faça um Programa que leia três
		 *  números e mostre o maior e o menor deles.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite outro número:");
		int num2 = entrada.nextInt();
		
		System.out.println("Digite outro número:");
		int num3 = entrada.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("O num1 é maior, num2 é "+num2+ " e num3 é "+num3+ " são menores!");	
		}else if(num2>num1 && num2>num3) {
			System.out.println("O num2 é maior, num1 é "+num1+" e num3 é "+num3+ " são menores!");
		}else if (num3>num1 && num3>num2) {
			System.out.println("O num3 é maior, num1 é "+num1+ " e num2 é "+num2+ " são menores!");
		}else {
			System.out.println("Tente novamente, resposta inválida!");
		}
		entrada.close();
		
		
	}

}

	


