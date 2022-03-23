package ExercAula015;

import java.util.Scanner;

public class Exerc013 {

	public static void main(String[] args) {
		/*13.Faça um Programa que leia um número e exiba o dia correspondente da semana.
	   (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido. */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual é dia da semana que você mais gosta?");
		System.out.println("1) para segunda-feira:");
		System.out.println("2) para terça-feira:");
		System.out.println("3) para quarta-feira:");
		System.out.println("4) para quinta-feira:");
		System.out.println("5) para sexta-feira:");
		System.out.println("6) para sabado:");
		System.out.println("7) para domingo:");
		int diaDaSemana = entrada.nextInt();
		
		switch(diaDaSemana) {
		case 1: System.out.println("Tenha força porque ainda é segunda-feira!");break;
		case 2: System.out.println("Culto da palavra!");break;
		case 3: System.out.println("Não tem culto!");break;
		case 4: System.out.println("Culto família!");break;
		case 5: System.out.println("Então sextou! Vamos descansar!");break;
		case 6: System.out.println("Vamos ao shopping!");break;
		case 7: System.out.println("Vamos a EBD!");break;
		default: System.out.println("Número inválido!");
		
		}

	}

}
