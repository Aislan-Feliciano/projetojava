package ExercAula015;

import java.util.Scanner;

public class Exerc010 {

	public static void main(String[] args) {
		/*10.Fa�a um Programa que pergunte em que turno voc� estuda.
		 *  Pe�a para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem
		 * "Bom Dia!","Boa Tarde!" ou "Boa Noite!" ou "Valor Inv�lido!", conforme o caso.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Em qual turno voc� estuda?");
		System.out.println("1) Para M-matutino");
		System.out.println("2) Para V-vespertino");
		System.out.println("3) Para N-noturno");
		int turno = entrada.nextInt();
		
		if(turno == 1) {
			System.out.println("Bom dia voc� estuda de manh�!");
		}
		else if(turno == 2) {
			System.out.println("Boa tarde, voc� estuda a tarde!");
		}
		else if(turno == 3) {
			System.out.println("Boa noite, voc� estuda a noite!");
		}
		else {
			System.out.println("Op��o inv�lida!");
		}
		
		entrada.close(); 
		

	}

}
