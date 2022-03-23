package ExercAula015;

import java.util.Scanner;

public class Exerc017 {

	public static void main(String[] args) {
		/* 17.Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este
	      ano é ou não bissexto.*/ 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um determinado ano:");
		int numAno = entrada.nextInt();
		
		int anoBissexto = numAno+4;
		
		if((numAno % 400 == 0) ||(numAno % 4 == 0 && numAno % 100 != 0)) {
			System.out.println("É um ano bissexto ");
		}else {
			System.out.println("Não é ano bissexto ");
		}
		entrada.close();
		

	}

}
