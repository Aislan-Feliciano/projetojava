package ExercAula015;

import java.util.Scanner;

public class Exerc020 {

	public static void main(String[] args) {
		/* 20.Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
		 1. "Telefonou para a vítima?"
		 2. "Esteve no local do crime?"
		 3. "Mora perto da vítima?" 
		 4. "Devia para a vítima?" 
		 5. "Já trabalhou com a vítima?"
		 O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
		 Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", 
		 entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".*/ 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Vamos ter fazer algumas perguntas!");
		System.out.println("1) Telefonou para a vítima?");
		System.out.println("2) Esteve no local do crime?");
		System.out.println("3) Mora perto da vítima?");
		System.out.println("4) Devia para a vítima?");
		System.out.println("5) Já trabalhou com a vítima?");
		int opcao = entrada.nextInt();
		
		switch(opcao) {
		case 2: System.out.println("Você é suspeito!"); break;
		case 3:
		case 4: System.out.println("Você é cumplice!"); break;
		case 5:System.out.println("Você é assassino!"); break;
		default: System.out.println("Você é inocente!");
		}
		entrada.close();
	}

}
