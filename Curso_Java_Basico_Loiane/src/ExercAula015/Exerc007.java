package ExercAula015;

import java.util.Scanner;

public class Exerc007 {

	public static void main(String[] args) {
		/*. 7. Fa�a um Programa que leia tr�s
		 *  n�meros e mostre o maior e o menor deles.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite outro n�mero:");
		int num2 = entrada.nextInt();
		
		System.out.println("Digite outro n�mero:");
		int num3 = entrada.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("O num1 � maior, num2 � "+num2+ " e num3 � "+num3+ " s�o menores!");	
		}else if(num2>num1 && num2>num3) {
			System.out.println("O num2 � maior, num1 � "+num1+" e num3 � "+num3+ " s�o menores!");
		}else if (num3>num1 && num3>num2) {
			System.out.println("O num3 � maior, num1 � "+num1+ " e num2 � "+num2+ " s�o menores!");
		}else {
			System.out.println("Tente novamente, resposta inv�lida!");
		}
		entrada.close();
		
		
	}

}

	


