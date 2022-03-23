package ExercAula015;

import java.util.Scanner;

public class Exerc022 {

	public static void main(String[] args) {
		/* 22.Uma fruteira est� vendendo frutas com a seguinte tabela de pre�os: 
		  
		 At� 5 Kg:                            Acima de 5 kg:
		 Morango: R$ 2,50 por kg              Morango: R$ 2,20 por kg
		 Ma�as: R$ 1,80 por kg                Ma�as: R$ 1,50 por kg
		 
		 Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receber�
	     ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos
	     e a quantidade (em Kg) de ma�as adquiridas e escreva o valor a ser pago pelo cliente.*/ 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos quilos de morango voc� quer levar?");
		double morango = entrada.nextDouble();
		
		System.out.println("Quantos quilos de ma�as voc� quer levar?");
		double macas = entrada.nextDouble();	
		
		double frutas = morango + macas;
		double valor = (morango*2.50)+(macas*1.80);
	
		if(morango<=5 && macas<=5) {
			System.out.println("Voce ir� pagar R$ 2,50 por kg de MORANGO e R$ 1,80 por kg de MAC�S");
			System.out.println("O valor do morango sem desconto foi: R$ "+ (morango*2.50));
			System.out.println("O valor da ma�� sem desconto foi: R$ "+ (macas*1.80));
			System.out.println("Valor total a pagar corresponde: R$ "+(morango*2.50)+(macas*1.80));
		}
		else if(morango>5 && macas>5) {
			System.out.println("Voce ir� pagar R$ 2,20 por kg de MORANGO e R$ 1,50 por kg de MA�AS");
			System.out.println("O valor do morango sairia: R$ "+ (morango*2.50) + " e valor das MA�AS R$ "+(macas*1.80));
			System.out.println("O valor do morango com desconto foi: R$ "+ (morango*2.20));
			System.out.println("O valor da ma�as com desconto foi: R$ "+ (macas*1.50));
			System.out.println("Valor total a pagar corresponde: R$ "+(morango*2.20)+(macas*1.50));
		}
	    else if(valor>25) {		
			System.out.println("Voc� ter� um desconto de 10%!: "+valor);			
			//System.out.println("Se o valor ultrapassar R$25,00 tamb�m ter� um desconto de 10%!");
		}
		else {			
			System.out.println("N�o ter� desconto de 10%!:");
		}
		entrada.close();

	}

}
