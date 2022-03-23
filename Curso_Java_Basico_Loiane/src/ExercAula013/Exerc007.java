package ExercAula013;

import java.util.Scanner;

public class Exerc007 {

	public static void main(String[] args) {
		
		/*7. Faça um Programa que calcule a área de um quadrado,
		em seguida mostre o dobro desta área para o usuário.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um número:");
		double num1 = entrada.nextDouble();
		
		System.out.println("digite outro número:");
		double num2 = entrada.nextDouble();
		
		double area = num1 * num2;
		double  dobroArea= area*2;
	
		
		System.out.println("O valor da area é: "+area+ " e seu dobro da area é: "+ dobroArea );
		entrada.close();		

	}

}
