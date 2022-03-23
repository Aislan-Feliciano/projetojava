package ExercAula017;

import java.util.Scanner;

public class Exerc004 {

	public static void main(String[] args) {
	/* 4. Supondo que a população de um país 'A' seja da ordem de 80.000 habitantes com uma taxa anual
	 de crescimento de 3% e que a população de 'B' seja 200.000 habitantes com uma taxa de crescimento
	 de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população
	 do país 'A' ultrapasse ou iguale a população do país 'B', mantidas as taxas de crescimento.*/ 
		
		Scanner entrada = new Scanner(System.in);
		
		double crescAnualA = 80000 * 3/100;
		double somaA = 80000 + crescAnualA;
		boolean validacao = false;
		
		double crescAnualB = 200000 * 1.5/100;
		double somaB = 200000 + crescAnualB;
		double ano = 0;
		double somaAno = somaA*ano;
		int cont = 0;
	
		do {
			System.out.println("Quantos anos o país 'A' ultrapassa o país 'B'?");
		    ano = entrada.nextDouble();
		    
			if(somaA >= somaB) {
				System.out.println("O resultado corresponde:"+(somaAno));
				System.out.println("O país 'A' ultrapassou ou igualou o país 'B'!");
				cont++;
				validacao = true;
			} else {
				System.out.println("O país 'B' continua sendo maior!");
			}
			
		}while(!validacao);
		
		entrada.close();

	}

}
