package ExercAula013;

import java.util.Scanner;

public class Exerc012 {

	public static void main(String[] args) {
		/*. 12.Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo
		  que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua altura:");
		double altura = entrada.nextDouble();
		
		System.out.println("Digite seu peso:");
		double peso = entrada.nextDouble();
		
		double pesoIdeal = (altura * peso) - 58;
		
		System.out.println("Medindo "+altura+ " e pesando "+peso+ " o resultado foi: " + pesoIdeal);

	}

}
