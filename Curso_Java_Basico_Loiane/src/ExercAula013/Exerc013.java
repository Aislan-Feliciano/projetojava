package ExercAula013;

import java.util.Scanner;

public class Exerc013 {

	public static void main(String[] args) {
		
		/*13.Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas 
		no m�s. Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o descontados 
		11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�:
	 .  sal�rio bruto. a. quanto pagou ao INSS. b. quanto pagou ao sindicato. c. o sal�rio l�quido. d.
	    calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo: + Sal�rio Bruto : R$ - IR 
	    (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Sal�rio Liquido : R$ 2. Obs.: Sal�rio Bruto 
	    - Descontos = Sal�rio L�quido. */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora? ");
		double pgHora = entrada.nextDouble();
		
		System.out.println("Qual � o n�meros de hora que voc� trabalha ao m�s?");
		double numHoras = entrada.nextDouble();
		
		double salarioTotal = pgHora * numHoras;
		double inpRenda = salarioTotal * 11/100;
		double inss = salarioTotal * 8/100;
		double sindicato = salarioTotal * 5/100;
		double desconto = inpRenda + inss + sindicato;
		double salarioLiquido = salarioTotal - desconto;
		
		
		System.out.println("O sal�rio bruto referido ao m�s foi: R$"+ salarioTotal);
		System.out.println("Desconto de 11%  do imposto de renda: R$" + inpRenda );
		System.out.println("Desconto de 8% de inss: R$" + inss);
		System.out.println("Desconto de 5% do sindicato: R$" + sindicato);
		System.out.println(" Sal�rio l�quido corresponde: R$" + salarioLiquido);
		
		
		
		
		

	}

}
