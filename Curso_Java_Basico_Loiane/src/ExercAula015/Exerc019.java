package ExercAula015;

import java.util.Scanner;

public class Exerc019 {

	public static void main(String[] args) {
		/*19.Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele
		 deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga se o 
		 número é: par ou ímpar; positivo ou negativo*/ 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha uma opção:");		
		System.out.println("1) Adição");
		System.out.println("2) Subtração");
		System.out.println("3) Divisão");
		System.out.println("4) Multiplicação");
		System.out.println("0) Retornar");
		int opcao = entrada.nextInt();
		
		System.out.println("Digite um número:");
		double num1 = entrada.nextDouble();
		
		System.out.println("digite outro número:");
		double num2 = entrada.nextDouble();
		
		double soma = num1 + num2;
		double subtracao = num1 - num2;
		double divisao = num1 / num2;
		double multiplicacao = num1 * num2;
		
		if(opcao==1 && soma % 2==0) {
			System.out.println("A operação é adição");
			System.out.println("A soma "+num1+ " + " +num2+ " = " +(soma));	
			System.out.println("Os números somados são pares ");
		}
		else if(opcao==1 && soma % 2==1) {
			System.out.println("A operação é adição");
			System.out.println("A soma "+num1+ " + " +num2+ " = " +(soma));	
			System.out.println("Os números somados são impares ");
		}
		else if(opcao==2 && subtracao % 2==0) {
			System.out.println("A operação é subtração");
			System.out.println("A subtração "+num1+ " - " +num2+ " = " +(subtracao));	
			System.out.println("Os números subtraidos são pares ");
		}
		else if(opcao==2 && subtracao % 2==1) {
			System.out.println("A operação é subtração");
			System.out.println("A subtração "+num1+ " - " +num2+ " = " +(subtracao));	
			System.out.println("Os números subtraidos são impares ");		
		}
		else if(opcao==3 && divisao % 2==0) {
			System.out.println("A operação é divisão");
			System.out.println("A divisão "+num1+ " / " +num2+ " = " +(divisao));	
			System.out.println("Os números divididos são pares ");
		}
		else if(opcao==3 && divisao % 2==1) {
			System.out.println("A operação é divisão");
			System.out.println("A subtração "+num1+ " / " +num2+ " = " +(divisao));	
			System.out.println("Os números divididos são impares ");		
		}
		else if(opcao==4 && multiplicacao % 2==0) {
			System.out.println("A operação é multiplicação");
			System.out.println("A subtração "+num1+ " * " +num2+ " = " +(multiplicacao));	
			System.out.println("Os números multiplicados são pares ");
		}
		else if(opcao==4 && multiplicacao % 2==1) {
			System.out.println("A operação é multiplicação");
			System.out.println("A subtração "+num1+ " * " +num2+ " = " +(multiplicacao));	
			System.out.println("Os números multiplicados são impares ");		
		}
		else if(opcao!=1 && opcao!=2 && opcao!=3 && opcao!=4) {
			System.out.println("Opção invalida!");
		}		
		
		entrada.close();		

	}

}
