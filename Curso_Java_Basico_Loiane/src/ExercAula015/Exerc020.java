package ExercAula015;

import java.util.Scanner;

public class Exerc020 {

	public static void main(String[] args) {
		/* 20.Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas s�o:
		 1. "Telefonou para a v�tima?"
		 2. "Esteve no local do crime?"
		 3. "Mora perto da v�tima?" 
		 4. "Devia para a v�tima?" 
		 5. "J� trabalhou com a v�tima?"
		 O programa deve no final emitir uma classifica��o sobre a participa��o da pessoa no crime.
		 Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "Suspeita", 
		 entre 3 e 4 como "C�mplice" e 5 como "Assassino". Caso contr�rio, ele ser� classificado como "Inocente".*/ 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Vamos ter fazer algumas perguntas!");
		System.out.println("1) Telefonou para a v�tima?");
		System.out.println("2) Esteve no local do crime?");
		System.out.println("3) Mora perto da v�tima?");
		System.out.println("4) Devia para a v�tima?");
		System.out.println("5) J� trabalhou com a v�tima?");
		int opcao = entrada.nextInt();
		
		switch(opcao) {
		case 2: System.out.println("Voc� � suspeito!"); break;
		case 3:
		case 4: System.out.println("Voc� � cumplice!"); break;
		case 5:System.out.println("Voc� � assassino!"); break;
		default: System.out.println("Voc� � inocente!");
		}
		entrada.close();
	}

}
