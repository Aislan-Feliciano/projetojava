package ExercAula015;

import java.util.Scanner;

public class Exerc023 {

	public static void main(String[] args) {
		/* 23.O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira: 
		                    Até 5 Kg:                          Acima de 5 Kg:
		 File Duplo:      R$ 4,90 por Kg                      R$ 5,80 por Kg 
		 Alcatra:         R$ 5,90 por Kg                      R$ 6,80 por Kg 
		 Picanha:         R$ 6,90 por Kg                      R$ 7,80 por Kg 
		 
		 Para atender a todos os clientes, cada cliente poderá levar apenas
		 um dos tipos de carne da promoção, porém não há limites para a quantidade de carne por cliente. Se compra 
		 for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total a compra. Escreva um
		 programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as
		 informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor
		 a pagar. Fonte dos exercícios:*/ 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual é tipo de carne você quer levar?");
		System.out.println("1) PARA FILE DUBLO");
		System.out.println("2) PARA ALCATRA");
		System.out.println("3) PARA PICANHA");
		System.out.println("Qual é forma de pagamento?");
		System.out.println("4) PAGAMENTO NO DÉBITO");
		System.out.println("5) PAGAMENTO NO CREDITO");
		int opcao = entrada.nextInt();
		
		double file = 0;
		int debito = 0;
		
		
		if(opcao==1 && file<=5) {
			System.out.println("Quantos quilos de file dublo você vai levar?");
		    file = entrada.nextDouble();
		    System.out.println("Você comprou: kg "+file);
	        System.out.println("Você irá pagar: R$ "+(file*4.90));
	        //System.out.println("Você terá deconto de 5%!");
		  
		} 
		if(opcao==4) {
			 System.out.println("Qual é forma do pagamento:");
			 System.out.println("pagamento vai ser no debito.");
			
		}
		if(opcao==2) {
			System.out.println("Quantos quilos de alcatra você vai levar?");
			double alcatra = entrada.nextDouble();
			System.out.println("Você comprou: Kg "+alcatra);
		}
	    if(opcao==3) {
			System.out.println("Quantos quilos de picanha você vai levar?");
			double picanha = entrada.nextDouble();
		}
	   	entrada.close();
		 
		

	}

}
