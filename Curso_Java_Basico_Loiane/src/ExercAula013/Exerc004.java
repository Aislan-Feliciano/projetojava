package ExercAula013;

import java.util.Scanner;

public class Exerc004 {
	public static void main(String[] args) {
		
		//4. Fa�a um Programa que pe�a as 4 notas bimestraise mostre a m�dia. 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		Double num1 = entrada.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		Double num2 = entrada.nextDouble();
		
		System.out.println("Digite sua terceira nota: ");
		double num3 = entrada.nextDouble();
		
		System.out.println("Digite sua quarta nota: ");
		Double num4 = entrada.nextDouble();
		Double soma = (num1 + num2 + num3 + num4) / 4;
		System.out.println("A SOMA TOTAL DAS NOTAS FOI: " + soma);
		
		if(soma > 6 ) {
			System.out.println("ALUNO APROVADO, PARAB�NS!");
		}
		else if(soma == 6) {
			System.out.println("ALUNO ESTA EM RECUPERA��O, AINDA DAR TEMPO VAI ESTUDAR!");
		}
		else {
			System.out.println("ALUNO REPROVADO! VOC� N�O ESTUDOU ENT�O DAN�OU!");
			entrada.close();
		}
		
		
		
				
		
	}

}
