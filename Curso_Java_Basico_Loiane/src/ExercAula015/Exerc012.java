package ExercAula015;

import java.util.Scanner;

public class Exerc012 {

	public static void main(String[] args) {
		/*12.Fa�a um programa para o c�lculo de uma folha de pagamento, sabendo que os descontos s�o
		do Imposto de Renda, que depende do sal�rio bruto (conforme tabela abaixo) e 3% para o
	    Sindicato e que o FGTS corresponde a 11% do Sal�rio Bruto, mas n�o � descontado 
		(� a empresa que deposita). O Sal�rio L�quido corresponde ao Sal�rio Bruto menos os descontos. 
	    O programa dever� pedir ao usu�rio o valor da sua hora e a quantidade de horas trabalhadas no m�s.
	      Desconto do IR:
	      Sal�rio Bruto at� 900 (inclusive) - isento 
	      Sal�rio Bruto at� 1500 (inclusive) - desconto de 5% 
		  Sal�rio Bruto at� 2500 (inclusive) - desconto de 10% 
	      Sal�rio Bruto acima de 2500 - desconto de 20% Imprima na tela as informa��es, dispostas conforme o exemplo
	    abaixo. No exemplo o valor da hora � 5 e a quantidade de hora � 220. Sal�rio Bruto: (5 * 220) :
	    R$ 1100,00 (-) IR (5%) : R$ 55,00 (-) INSS ( 10%) : R$ 110,00 FGTS (11%) : R$ 121,00 Total
	    de descontos : R$ 165,00 Sal�rio Liquido : R$ 935,00 */
		
		Scanner entrada = new Scanner(System.in);
		
		//System.out.println("Quanto voc� ganha por m�s?");
		//double salarioBruto = entrada.nextDouble();
		
		System.out.println("Quantos dias na semana voc� trabalha?");
	    int diaSemana = entrada.nextInt();		
		
		System.out.println("Quantas horas semanas voc� trabalha?");
		double horaDia = entrada.nextDouble();
		
		System.out.println("Quando voc� ganha por hora?");
		double valorHora = entrada.nextDouble();
		
		double valorSemanal = (horaDia*valorHora);
		System.out.println("Seu sal�rio por semana corresponde: R$" +(valorSemanal));
		
		double salarioBruto = valorSemanal*4; // 4 semanas
		System.out.println("Sal�rio bruto corresponde: R$" +(salarioBruto));
		
		double fgts = salarioBruto*11/100;
		System.out.println("O desconto FGTS corresponde: R$" + fgts);
		

		double desconto1 = salarioBruto*5/100;
		double desconto2 = salarioBruto*10/100;
		double desconto3 = salarioBruto*20/100;
		
		if(salarioBruto<=900) {
			System.out.println("voc� esta insento!");
		}
		else if(salarioBruto<=1500) {
			System.out.println("Voc� vai ter um desconto de 5% do INSS: R$" +(desconto1));
			System.out.println("Seu sal�rio l�quido corresponde: R$" +(salarioBruto - desconto1));
		}
		else if(salarioBruto<=2500) {
			System.out.println("Voc� vai ter um desconto de 10% do INSS: R$" +(desconto2));
			System.out.println("Seu sal�rio l�quido corresponde: R$" +(salarioBruto - desconto2));
		}
		else if(salarioBruto>2500) {
			System.out.println("Voc� vai ter um desconto de 20% do INSS: R$" +(desconto3));
			System.out.println("Seu sal�rio l�quido corresponde: R$" +(salarioBruto - desconto3));
		}
		
		entrada.close();
		
		
		

	}

}
