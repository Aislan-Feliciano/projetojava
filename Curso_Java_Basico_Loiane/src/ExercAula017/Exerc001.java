package ExercAula017;

import java.util.Scanner;

public class Exerc001 {

	public static void main(String[] args) {		
		
		/*1. Fa�a um programa que pe�a uma nota, entre zero e dez.
		Mostre uma mensagem caso o valor seja inv�lido e continue pedindo 
		at� que o usu�rio informe um valor v�lido.*/ 

		Scanner entrada = new Scanner(System.in);	
		boolean notaValida = false;
		
		do {
			System.out.println("Digite uma nota:");
			int num = entrada.nextInt();
			
			if(num >= 0 && num <= 10) {
				System.out.println("Sua nota foi aceita " +num);
				notaValida = true;
			} else {
				System.out.println("Nota inv�lida, tente novamente!");
			}
		}	
		while(notaValida == false);	//!notaValida pode ser utilizador como forma de nega��o.
			
		
		
	    
		
		
	}

}
