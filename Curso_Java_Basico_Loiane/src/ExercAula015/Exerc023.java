package ExercAula015;

import java.util.Scanner;

public class Exerc023 {

	public static void main(String[] args) {
		/* 23.O Hipermercado Tabajara est� com uma promo��o de carnes que � imperd�vel. Confira: 
		                    At� 5 Kg:                          Acima de 5 Kg:
		 File Duplo:      R$ 4,90 por Kg                      R$ 5,80 por Kg 
		 Alcatra:         R$ 5,90 por Kg                      R$ 6,80 por Kg 
		 Picanha:         R$ 6,90 por Kg                      R$ 7,80 por Kg 
		 
		 Para atender a todos os clientes, cada cliente poder� levar apenas
		 um dos tipos de carne da promo��o, por�m n�o h� limites para a quantidade de carne por cliente. Se compra 
		 for feita no cart�o Tabajara o cliente receber� ainda um desconto de 5% sobre o total a compra. Escreva um
		 programa que pe�a o tipo e a quantidade de carne comprada pelo usu�rio e gere um cupom fiscal, contendo as
		 informa��es da compra: tipo e quantidade de carne, pre�o total, tipo de pagamento, valor do desconto e valor
		 a pagar. Fonte dos exerc�cios:*/ 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual � tipo de carne voc� quer levar?");
		System.out.println("1) PARA FILE DUBLO");
		System.out.println("2) PARA ALCATRA");
		System.out.println("3) PARA PICANHA");
		System.out.println("Qual � forma de pagamento?");
		System.out.println("4) PAGAMENTO NO D�BITO");
		System.out.println("5) PAGAMENTO NO CREDITO");
		int opcao = entrada.nextInt();
		
		double file = 0;
		int debito = 0;
		
		
		if(opcao==1 && file<=5) {
			System.out.println("Quantos quilos de file dublo voc� vai levar?");
		    file = entrada.nextDouble();
		    System.out.println("Voc� comprou: kg "+file);
	        System.out.println("Voc� ir� pagar: R$ "+(file*4.90));
	        //System.out.println("Voc� ter� deconto de 5%!");
		  
		} 
		if(opcao==4) {
			 System.out.println("Qual � forma do pagamento:");
			 System.out.println("pagamento vai ser no debito.");
			
		}
		if(opcao==2) {
			System.out.println("Quantos quilos de alcatra voc� vai levar?");
			double alcatra = entrada.nextDouble();
			System.out.println("Voc� comprou: Kg "+alcatra);
		}
	    if(opcao==3) {
			System.out.println("Quantos quilos de picanha voc� vai levar?");
			double picanha = entrada.nextDouble();
		}
	   	entrada.close();
		 
		

	}

}
