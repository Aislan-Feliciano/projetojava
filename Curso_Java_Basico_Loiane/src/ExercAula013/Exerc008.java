package ExercAula013;

import java.util.Scanner;

public class Exerc008 {

	public static void main(String[] args) {
		/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
		Calcule e mostre o total do seu salário no referido mês.*/
		
		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?");
		double valorHora = entrada.nextDouble();
		
		System.out.println("Qual foi número de horas que você trabalhou nesse mês?");
		double valorMes = entrada.nextDouble();
	
		System.out.println("Valor total que você irá receber será: "+ (valorHora * valorMes));
	  

	}

}
