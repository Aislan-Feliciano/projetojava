package ExercAula013;

import java.util.Scanner;

public class Exerc008 {

	public static void main(String[] args) {
		/*Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s.
		Calcule e mostre o total do seu sal�rio no referido m�s.*/
		
		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora?");
		double valorHora = entrada.nextDouble();
		
		System.out.println("Qual foi n�mero de horas que voc� trabalhou nesse m�s?");
		double valorMes = entrada.nextDouble();
	
		System.out.println("Valor total que voc� ir� receber ser�: "+ (valorHora * valorMes));
	  

	}

}
