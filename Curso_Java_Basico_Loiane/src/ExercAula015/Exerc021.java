package ExercAula015;

import java.util.Scanner;

public class Exerc021 {

	public static void main(String[] args) {
		/* 21.Um posto está vendendo combustíveis com a seguinte tabela de descontos:
		 Álcool: 
			 a. até 20 litros, desconto de 3% por litro. 
			 b. acima de 20 litros, desconto de 5% por litro.
		 Gasolina: 
			 c. até 20 litros, desconto de 4% por litro. 
			 d. acima de 20 litros, desconto de 6% por litro.		 
		 Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível
	    (codificado da seguinte forma: A-álcool, G- gasolina), calcule e imprima o valor a ser
		 pago pelo cliente, sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.*/ 
		
		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("Vai a bastecer com ÁLCOOL OU GASOLINA?");
		System.out.println("1) ÁLCOOL");
		System.out.println("2) GASOLINA");
		int opcao = entrada.nextInt();
		
		System.out.println("Quantos litros de ÁLCOOL você vai bastecer?");
		double A = entrada.nextDouble();
		 
		System.out.println("Quantos litros de GASOLINA você vai bastecer?");
		double G = entrada.nextDouble();
		double decontoA1 = (A - (A*3/100));
		double decontoA2 = (A - (A*5/100));
		double decontoG1 = (G - (G*4/100));
		double decontoG2 = (G - (G*6/100));
		
	    if(opcao==1 && A <= 20 ) {
	    	System.out.println("");
	    	System.out.println("O preço do litro do álcool custa R$ 1,90 você terá um desconto de 3%");
	    	System.out.println("O valor total a pagar R$"+decontoA1);
	    }
	    else if(opcao==1 && A > 20) {
	    	System.out.println("O preço do litro do álcool custa R$ 1,90 você terá um desconto de 5% no ÁLCOOL");
	    	System.out.println("O valor total a pagar R$"+decontoA2);
	    }
	    else if(opcao==2 && G <= 20) {
	    	System.out.println("O preço do litro do gasolina custa R$ 2,50 você terá um desconto de 4% na GASOLINA");
	    	System.out.println("O valor total a pagar R$"+decontoG1);
	    }
	    else if(opcao==2 && G > 20) {
	    	System.out.println("O preço do litro do gasolina custa R$ 2,50 você terá um desconto de 6% na GASOLINA");
	    	System.out.println("O valor total a pagar R$"+decontoG2);
	    }
		entrada.close();
		

	}

}
