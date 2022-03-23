package ExercAula015;

import java.util.Scanner;

public class Exerc015 {

	public static void main(String[] args) {
		/*15.Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa dever� informar se os
		valores podem ser um tri�ngulo. Indique, caso os lados formem um tri�ngulo, se o mesmo �:
	    equil�tero, is�sceles ou escaleno.
	    Dicas: o Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que o terceiro;
	    Tri�ngulo Equil�tero: tr�s lados iguais;
	    Tri�ngulo Is�sceles: quaisquer dois lados iguais;
	    Tri�ngulo Escaleno: tr�s lados diferentes;*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro �ngulo do tri�ngulo");
		double ang1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo �ngulo do tri�ngulo");
		double ang2 = entrada.nextDouble();
		
		System.out.println("Digite o terceiro �ngulo do tri�ngulo");
		double ang3 = entrada.nextDouble();
		
		if(ang1==ang2 && ang1==ang3) {
			System.out.println("O tri�ngulo � equil�tero porque tem tr�s lados iguais!");
		}
		else if(ang1==ang2 && ang1!=ang3 || ang2==ang1 && ang2!=ang3 || ang3==ang1 && ang3!=ang2 || ang2==ang3 && ang3==ang2){
			System.out.println("O tri�ngulo � is�sceles porque tem dois lados iguais!");
		}
		else {
			System.out.println("O tri�ngulo � escaleno porque tem tr�s lados diferentes!");
		}
		entrada.close();
		

	}

}
