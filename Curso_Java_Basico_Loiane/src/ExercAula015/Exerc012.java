package ExercAula015;

import java.util.Scanner;

public class Exerc012 {

	public static void main(String[] args) {
		/*12.Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são
		do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o
	    Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado 
		(é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. 
	    O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
	      Desconto do IR:
	      Salário Bruto até 900 (inclusive) - isento 
	      Salário Bruto até 1500 (inclusive) - desconto de 5% 
		  Salário Bruto até 2500 (inclusive) - desconto de 10% 
	      Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo
	    abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220. Salário Bruto: (5 * 220) :
	    R$ 1100,00 (-) IR (5%) : R$ 55,00 (-) INSS ( 10%) : R$ 110,00 FGTS (11%) : R$ 121,00 Total
	    de descontos : R$ 165,00 Salário Liquido : R$ 935,00 */
		
		Scanner entrada = new Scanner(System.in);
		
		//System.out.println("Quanto você ganha por mês?");
		//double salarioBruto = entrada.nextDouble();
		
		System.out.println("Quantos dias na semana você trabalha?");
	    int diaSemana = entrada.nextInt();		
		
		System.out.println("Quantas horas semanas você trabalha?");
		double horaDia = entrada.nextDouble();
		
		System.out.println("Quando você ganha por hora?");
		double valorHora = entrada.nextDouble();
		
		double valorSemanal = (horaDia*valorHora);
		System.out.println("Seu salário por semana corresponde: R$" +(valorSemanal));
		
		double salarioBruto = valorSemanal*4; // 4 semanas
		System.out.println("Salário bruto corresponde: R$" +(salarioBruto));
		
		double fgts = salarioBruto*11/100;
		System.out.println("O desconto FGTS corresponde: R$" + fgts);
		

		double desconto1 = salarioBruto*5/100;
		double desconto2 = salarioBruto*10/100;
		double desconto3 = salarioBruto*20/100;
		
		if(salarioBruto<=900) {
			System.out.println("você esta insento!");
		}
		else if(salarioBruto<=1500) {
			System.out.println("Você vai ter um desconto de 5% do INSS: R$" +(desconto1));
			System.out.println("Seu salário líquido corresponde: R$" +(salarioBruto - desconto1));
		}
		else if(salarioBruto<=2500) {
			System.out.println("Você vai ter um desconto de 10% do INSS: R$" +(desconto2));
			System.out.println("Seu salário líquido corresponde: R$" +(salarioBruto - desconto2));
		}
		else if(salarioBruto>2500) {
			System.out.println("Você vai ter um desconto de 20% do INSS: R$" +(desconto3));
			System.out.println("Seu salário líquido corresponde: R$" +(salarioBruto - desconto3));
		}
		
		entrada.close();
		
		
		

	}

}
