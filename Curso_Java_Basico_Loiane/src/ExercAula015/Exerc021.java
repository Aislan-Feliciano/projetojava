package ExercAula015;

import java.util.Scanner;

public class Exerc021 {

	public static void main(String[] args) {
		/* 21.Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
		 �lcool: 
			 a. at� 20 litros, desconto de 3% por litro. 
			 b. acima de 20 litros, desconto de 5% por litro.
		 Gasolina: 
			 c. at� 20 litros, desconto de 4% por litro. 
			 d. acima de 20 litros, desconto de 6% por litro.		 
		 Escreva um algoritmo que leia o n�mero de litros vendidos, o tipo de combust�vel
	    (codificado da seguinte forma: A-�lcool, G- gasolina), calcule e imprima o valor a ser
		 pago pelo cliente, sabendo-se que o pre�o do litro da gasolina � R$ 2,50 o pre�o do litro do �lcool � R$ 1,90.*/ 
		
		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("Vai a bastecer com �LCOOL OU GASOLINA?");
		System.out.println("1) �LCOOL");
		System.out.println("2) GASOLINA");
		int opcao = entrada.nextInt();
		
		System.out.println("Quantos litros de �LCOOL voc� vai bastecer?");
		double A = entrada.nextDouble();
		 
		System.out.println("Quantos litros de GASOLINA voc� vai bastecer?");
		double G = entrada.nextDouble();
		double decontoA1 = (A - (A*3/100));
		double decontoA2 = (A - (A*5/100));
		double decontoG1 = (G - (G*4/100));
		double decontoG2 = (G - (G*6/100));
		
	    if(opcao==1 && A <= 20 ) {
	    	System.out.println("");
	    	System.out.println("O pre�o do litro do �lcool custa R$ 1,90 voc� ter� um desconto de 3%");
	    	System.out.println("O valor total a pagar R$"+decontoA1);
	    }
	    else if(opcao==1 && A > 20) {
	    	System.out.println("O pre�o do litro do �lcool custa R$ 1,90 voc� ter� um desconto de 5% no �LCOOL");
	    	System.out.println("O valor total a pagar R$"+decontoA2);
	    }
	    else if(opcao==2 && G <= 20) {
	    	System.out.println("O pre�o do litro do gasolina custa R$ 2,50 voc� ter� um desconto de 4% na GASOLINA");
	    	System.out.println("O valor total a pagar R$"+decontoG1);
	    }
	    else if(opcao==2 && G > 20) {
	    	System.out.println("O pre�o do litro do gasolina custa R$ 2,50 voc� ter� um desconto de 6% na GASOLINA");
	    	System.out.println("O valor total a pagar R$"+decontoG2);
	    }
		entrada.close();
		

	}

}
