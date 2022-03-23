package ExercAula013;

import java.util.Scanner;

public class Exerc013 {

	public static void main(String[] args) {
		
		/*13.Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas 
		no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 
		11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
	 .  salário bruto. a. quanto pagou ao INSS. b. quanto pagou ao sindicato. c. o salário líquido. d.
	    calcule os descontos e o salário líquido, conforme a tabela abaixo: + Salário Bruto : R$ - IR 
	    (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$ 2. Obs.: Salário Bruto 
	    - Descontos = Salário Líquido. */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double pgHora = entrada.nextDouble();
		
		System.out.println("Qual é o números de hora que você trabalha ao mês?");
		double numHoras = entrada.nextDouble();
		
		double salarioTotal = pgHora * numHoras;
		double inpRenda = salarioTotal * 11/100;
		double inss = salarioTotal * 8/100;
		double sindicato = salarioTotal * 5/100;
		double desconto = inpRenda + inss + sindicato;
		double salarioLiquido = salarioTotal - desconto;
		
		
		System.out.println("O salário bruto referido ao mês foi: R$"+ salarioTotal);
		System.out.println("Desconto de 11%  do imposto de renda: R$" + inpRenda );
		System.out.println("Desconto de 8% de inss: R$" + inss);
		System.out.println("Desconto de 5% do sindicato: R$" + sindicato);
		System.out.println(" Salário líquido corresponde: R$" + salarioLiquido);
		
		
		
		
		

	}

}
