package ExercAula015;

import java.util.Scanner;

public class Exerc011 {

	public static void main(String[] args) {
		/*11.As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores
		  e lhe contraram para desenvolver o programa que calcular� os reajustes. o Fa�a um 
		 programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte crit�rio,
		 baseado no sal�rio atual: o sal�rios at� R$ 280,00 (incluindo) : aumento de 20% o sal�rios;
		 entre R$ 280,00 e R$ 700,00 : aumento de 15% o sal�rios; entre R$ 700,00 e R$ 1500,00 :
		 aumento de 10%; o sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o aumento ser
		 realizado, informe na tela: o o sal�rio antes do reajuste; o o percentual de aumento aplicado;
		 o o valor do aumento; o o novo sal�rio, ap�s o aumento.*/ 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu sal�rio atual:");
		double salarioAtual = entrada.nextDouble();
		
		double reajuste1 = salarioAtual*20/100;
		double reajuste2 = salarioAtual*15/100;
		double reajuste3 = salarioAtual*10/100;
		double reajuste4 = salarioAtual*5/100;
		
		if(salarioAtual<=280) {
			System.out.println("Funcion�rio recebe um aumento de 20%: R$" +reajuste1);
			System.out.println("Sal�rio com reajuste equivale: R$" +(salarioAtual+reajuste1));
		}
		else if(salarioAtual>280 && salarioAtual<=700) {
			System.out.println("Funcion�rio recebe um aumento de 15%: R$" +reajuste2);
			System.out.println("Sal�rio com reajuste equivale: R$" +(salarioAtual+reajuste2));
		}
		else if(salarioAtual>700 && salarioAtual<1500) {
			System.out.println("Funcion�rio recebe um aumento de 10%: R$" +reajuste3);
			System.out.println("Sal�rio com reajuste equivale: R$" +(salarioAtual+reajuste3));
		}
		else if(salarioAtual>=1500) {
			System.out.println("Funcion�rio recebe um aumento de 5%: R$" +reajuste4);
			System.out.println("Sal�rio com reajuste equivale: R$" +(salarioAtual+reajuste4));
		}
		
		entrada.close();

	}

}
