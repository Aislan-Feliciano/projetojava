package ExercAula015;

import java.util.Scanner;

public class Exerc011 {

	public static void main(String[] args) {
		/*11.As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores
		  e lhe contraram para desenvolver o programa que calculará os reajustes. o Faça um 
		 programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério,
		 baseado no salário atual: o salários até R$ 280,00 (incluindo) : aumento de 20% o salários;
		 entre R$ 280,00 e R$ 700,00 : aumento de 15% o salários; entre R$ 700,00 e R$ 1500,00 :
		 aumento de 10%; o salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser
		 realizado, informe na tela: o o salário antes do reajuste; o o percentual de aumento aplicado;
		 o o valor do aumento; o o novo salário, após o aumento.*/ 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu salário atual:");
		double salarioAtual = entrada.nextDouble();
		
		double reajuste1 = salarioAtual*20/100;
		double reajuste2 = salarioAtual*15/100;
		double reajuste3 = salarioAtual*10/100;
		double reajuste4 = salarioAtual*5/100;
		
		if(salarioAtual<=280) {
			System.out.println("Funcionário recebe um aumento de 20%: R$" +reajuste1);
			System.out.println("Salário com reajuste equivale: R$" +(salarioAtual+reajuste1));
		}
		else if(salarioAtual>280 && salarioAtual<=700) {
			System.out.println("Funcionário recebe um aumento de 15%: R$" +reajuste2);
			System.out.println("Salário com reajuste equivale: R$" +(salarioAtual+reajuste2));
		}
		else if(salarioAtual>700 && salarioAtual<1500) {
			System.out.println("Funcionário recebe um aumento de 10%: R$" +reajuste3);
			System.out.println("Salário com reajuste equivale: R$" +(salarioAtual+reajuste3));
		}
		else if(salarioAtual>=1500) {
			System.out.println("Funcionário recebe um aumento de 5%: R$" +reajuste4);
			System.out.println("Salário com reajuste equivale: R$" +(salarioAtual+reajuste4));
		}
		
		entrada.close();

	}

}
