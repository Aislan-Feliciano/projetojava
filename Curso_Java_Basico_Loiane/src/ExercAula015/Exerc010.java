package ExercAula015;

import java.util.Scanner;

public class Exerc010 {

	public static void main(String[] args) {
		/*10.Faça um Programa que pergunte em que turno você estuda.
		 *  Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem
		 * "Bom Dia!","Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Em qual turno você estuda?");
		System.out.println("1) Para M-matutino");
		System.out.println("2) Para V-vespertino");
		System.out.println("3) Para N-noturno");
		int turno = entrada.nextInt();
		
		if(turno == 1) {
			System.out.println("Bom dia você estuda de manhã!");
		}
		else if(turno == 2) {
			System.out.println("Boa tarde, você estuda a tarde!");
		}
		else if(turno == 3) {
			System.out.println("Boa noite, você estuda a noite!");
		}
		else {
			System.out.println("Opção inválida!");
		}
		
		entrada.close(); 
		

	}

}
