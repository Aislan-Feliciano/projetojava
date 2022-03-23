package ExercAula017;

import java.util.Scanner;

public class Exerc001 {

	public static void main(String[] args) {		
		
		/*1. Faça um programa que peça uma nota, entre zero e dez.
		Mostre uma mensagem caso o valor seja inválido e continue pedindo 
		até que o usuário informe um valor válido.*/ 

		Scanner entrada = new Scanner(System.in);	
		boolean notaValida = false;
		
		do {
			System.out.println("Digite uma nota:");
			int num = entrada.nextInt();
			
			if(num >= 0 && num <= 10) {
				System.out.println("Sua nota foi aceita " +num);
				notaValida = true;
			} else {
				System.out.println("Nota inválida, tente novamente!");
			}
		}	
		while(notaValida == false);	//!notaValida pode ser utilizador como forma de negação.
			
		
		
	    
		
		
	}

}
