package ExercAula015;

import java.util.Scanner;

public class Exerc022 {

	public static void main(String[] args) {
		/* 22.Uma fruteira está vendendo frutas com a seguinte tabela de preços: 
		  
		 Até 5 Kg:                            Acima de 5 kg:
		 Morango: R$ 2,50 por kg              Morango: R$ 2,20 por kg
		 Maças: R$ 1,80 por kg                Maças: R$ 1,50 por kg
		 
		 Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
	     ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos
	     e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.*/ 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos quilos de morango você quer levar?");
		double morango = entrada.nextDouble();
		
		System.out.println("Quantos quilos de maças você quer levar?");
		double macas = entrada.nextDouble();	
		
		double frutas = morango + macas;
		double valor = (morango*2.50)+(macas*1.80);
	
		if(morango<=5 && macas<=5) {
			System.out.println("Voce irá pagar R$ 2,50 por kg de MORANGO e R$ 1,80 por kg de MACÃS");
			System.out.println("O valor do morango sem desconto foi: R$ "+ (morango*2.50));
			System.out.println("O valor da maçã sem desconto foi: R$ "+ (macas*1.80));
			System.out.println("Valor total a pagar corresponde: R$ "+(morango*2.50)+(macas*1.80));
		}
		else if(morango>5 && macas>5) {
			System.out.println("Voce irá pagar R$ 2,20 por kg de MORANGO e R$ 1,50 por kg de MAÇAS");
			System.out.println("O valor do morango sairia: R$ "+ (morango*2.50) + " e valor das MAÇAS R$ "+(macas*1.80));
			System.out.println("O valor do morango com desconto foi: R$ "+ (morango*2.20));
			System.out.println("O valor da maças com desconto foi: R$ "+ (macas*1.50));
			System.out.println("Valor total a pagar corresponde: R$ "+(morango*2.20)+(macas*1.50));
		}
	    else if(valor>25) {		
			System.out.println("Você terá um desconto de 10%!: "+valor);			
			//System.out.println("Se o valor ultrapassar R$25,00 também terá um desconto de 10%!");
		}
		else {			
			System.out.println("Não terá desconto de 10%!:");
		}
		entrada.close();

	}

}
