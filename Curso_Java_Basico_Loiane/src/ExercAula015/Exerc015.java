package ExercAula015;

import java.util.Scanner;

public class Exerc015 {

	public static void main(String[] args) {
		/*15.Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os
		valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é:
	    equilátero, isósceles ou escaleno.
	    Dicas: o Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
	    Triângulo Equilátero: três lados iguais;
	    Triângulo Isósceles: quaisquer dois lados iguais;
	    Triângulo Escaleno: três lados diferentes;*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro ângulo do triângulo");
		double ang1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo ângulo do triângulo");
		double ang2 = entrada.nextDouble();
		
		System.out.println("Digite o terceiro ângulo do triângulo");
		double ang3 = entrada.nextDouble();
		
		if(ang1==ang2 && ang1==ang3) {
			System.out.println("O triângulo é equilátero porque tem três lados iguais!");
		}
		else if(ang1==ang2 && ang1!=ang3 || ang2==ang1 && ang2!=ang3 || ang3==ang1 && ang3!=ang2 || ang2==ang3 && ang3==ang2){
			System.out.println("O triângulo é isósceles porque tem dois lados iguais!");
		}
		else {
			System.out.println("O triângulo é escaleno porque tem três lados diferentes!");
		}
		entrada.close();
		

	}

}
