package ExercAula013;

import java.util.Scanner;

public class Exerc007 {

	public static void main(String[] args) {
		
		/*7. Fa�a um Programa que calcule a �rea de um quadrado,
		em seguida mostre o dobro desta �rea para o usu�rio.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um n�mero:");
		double num1 = entrada.nextDouble();
		
		System.out.println("digite outro n�mero:");
		double num2 = entrada.nextDouble();
		
		double area = num1 * num2;
		double  dobroArea= area*2;
	
		
		System.out.println("O valor da area �: "+area+ " e seu dobro da area �: "+ dobroArea );
		entrada.close();		

	}

}
