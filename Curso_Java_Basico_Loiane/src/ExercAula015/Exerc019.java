package ExercAula015;

import java.util.Scanner;

public class Exerc019 {

	public static void main(String[] args) {
		/*19.Fa�a um Programa que leia 2 n�meros e em seguida pergunte ao usu�rio qual opera��o ele
		 deseja realizar. O resultado da opera��o deve ser acompanhado de uma frase que diga se o 
		 n�mero �: par ou �mpar; positivo ou negativo*/ 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha uma op��o:");		
		System.out.println("1) Adi��o");
		System.out.println("2) Subtra��o");
		System.out.println("3) Divis�o");
		System.out.println("4) Multiplica��o");
		System.out.println("0) Retornar");
		int opcao = entrada.nextInt();
		
		System.out.println("Digite um n�mero:");
		double num1 = entrada.nextDouble();
		
		System.out.println("digite outro n�mero:");
		double num2 = entrada.nextDouble();
		
		double soma = num1 + num2;
		double subtracao = num1 - num2;
		double divisao = num1 / num2;
		double multiplicacao = num1 * num2;
		
		if(opcao==1 && soma % 2==0) {
			System.out.println("A opera��o � adi��o");
			System.out.println("A soma "+num1+ " + " +num2+ " = " +(soma));	
			System.out.println("Os n�meros somados s�o pares ");
		}
		else if(opcao==1 && soma % 2==1) {
			System.out.println("A opera��o � adi��o");
			System.out.println("A soma "+num1+ " + " +num2+ " = " +(soma));	
			System.out.println("Os n�meros somados s�o impares ");
		}
		else if(opcao==2 && subtracao % 2==0) {
			System.out.println("A opera��o � subtra��o");
			System.out.println("A subtra��o "+num1+ " - " +num2+ " = " +(subtracao));	
			System.out.println("Os n�meros subtraidos s�o pares ");
		}
		else if(opcao==2 && subtracao % 2==1) {
			System.out.println("A opera��o � subtra��o");
			System.out.println("A subtra��o "+num1+ " - " +num2+ " = " +(subtracao));	
			System.out.println("Os n�meros subtraidos s�o impares ");		
		}
		else if(opcao==3 && divisao % 2==0) {
			System.out.println("A opera��o � divis�o");
			System.out.println("A divis�o "+num1+ " / " +num2+ " = " +(divisao));	
			System.out.println("Os n�meros divididos s�o pares ");
		}
		else if(opcao==3 && divisao % 2==1) {
			System.out.println("A opera��o � divis�o");
			System.out.println("A subtra��o "+num1+ " / " +num2+ " = " +(divisao));	
			System.out.println("Os n�meros divididos s�o impares ");		
		}
		else if(opcao==4 && multiplicacao % 2==0) {
			System.out.println("A opera��o � multiplica��o");
			System.out.println("A subtra��o "+num1+ " * " +num2+ " = " +(multiplicacao));	
			System.out.println("Os n�meros multiplicados s�o pares ");
		}
		else if(opcao==4 && multiplicacao % 2==1) {
			System.out.println("A opera��o � multiplica��o");
			System.out.println("A subtra��o "+num1+ " * " +num2+ " = " +(multiplicacao));	
			System.out.println("Os n�meros multiplicados s�o impares ");		
		}
		else if(opcao!=1 && opcao!=2 && opcao!=3 && opcao!=4) {
			System.out.println("Op��o invalida!");
		}		
		
		entrada.close();		

	}

}
