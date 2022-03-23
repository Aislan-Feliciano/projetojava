package ExercAula015;

import java.util.Scanner;

public class Exerc014 {

	public static void main(String[] args) {
		/*14.Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo 
	    de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
	    Média de Aproveitamento Conceito
		Entre 9.0 e 10.0 A 
	    Entre 7.5 e 9.0 B 
		Entre 6.0 e 7.5 C 
		Entre 4.0 e 6.0 D 
		Entre 4.0 e zero E 
	    O algoritmo deve mostrar na tela as notas, a média, conceito correspondente e a mensagem “APROVADO”
		se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("insira a primeira da nota:");
		double nota1 = entrada.nextDouble();
		
		System.out.println("insira a segunda da nota:");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) /2;
		
		if(nota1>=9 && nota2<=10) {
			System.out.println("Suas notas foram: " +nota1+ " e " +nota2+ " então sua média é "+ media);
			System.out.println("O aluno A esta aprovado!");
		}
		else if(nota1>=7.5 && nota2<=9) {
			System.out.println("Suas notas foram: " +nota1+ " e " +nota2+ " então sua média é "+ media);
			System.out.println("O aluno B esta aprovado!");	   
		}
		else if(nota1>=6 && nota2<=7.5) {
			System.out.println("Suas notas foram: " +nota1+ " e " +nota2+ " então sua média é "+ media);
			System.out.println("O aluno C esta aprovado!");
		}
		else if(nota1>=4 && nota2<=6) {
			System.out.println("Suas notas foram: " +nota1+ " e " +nota2+ " então sua média é "+ media);
			System.out.println("O aluno D esta reprovado!");
		}
		else if(nota1>=0 && nota2<4) {
			System.out.println("Suas notas foram: " +nota1+ " e " +nota2+ " então sua média é "+ media);
			System.out.println("O aluno E esta reprovado!");
		}
		else {
			System.out.println("O aluno não tirou essas notas! verifique suas notas e tente novamente!");
		}
		
		entrada.close();

	}

}
