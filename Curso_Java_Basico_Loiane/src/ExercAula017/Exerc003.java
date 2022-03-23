package ExercAula017;

import java.util.Scanner;

public class Exerc003 {

	public static void main(String[] args) {
		/* 3. Fa�a um programa que leia e valide as seguintes informa��es:
	    a. Nome: maior que 3 caracteres;
	    b. Idade: entre 0 e 150;
	    c. Sal�rio: maior que zero;
	    d. Sexo: 'f' ou 'm';
	    e. Estado Civil: 's', 'c', 'v', 'd'; */
		
		Scanner entrada = new Scanner(System.in);
		
		boolean validacao =  false;
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
				
		do {
			System.out.println("Digite seu nome:");
			 nome = entrada.next();
			
			if(nome.length()>3) {
				validacao = true;
			} else {
				System.out.println("O nome precisa ter tr�s caracteres!");
			}
			
		} while(!validacao);
		
        validacao = false;		
		do {
			System.out.println("Digite sua idade:");
			idade = entrada.nextInt();
			
			if(idade >= 0  && idade < 150) {
				validacao = true;
			} else {
				System.out.println("A idade precisa est� entre 0 e 150!");
			}
			
		} while(!validacao);
		
		validacao = false;			
		do {
			System.out.println("Digite seu sal�rio:");
		    salario = entrada.nextDouble();
				
			if(salario > 0) {
			   validacao = true;			
			} else {
				System.out.println("Seu sal�rio precisar ser maior que zero!");
			}
			
		} while(!validacao);		
			
        validacao = false;				
		do {
			System.out.println("Digite seu sexo: 'M' masculino e 'F' feminino:");
		    sexo = entrada.next();
										
			if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				validacao = true;
			} else {
				System.out.println("O sexo precisar 'm' ou 'f'!");
			}
			
	    } while(!validacao);
		
		validacao = false;				
		do {
			System.out.println("Digite seu estado civil:");
			System.out.println("'S' solteiro, 'C' casado, 'V' viuvo e 'D' divorciado!:");
		    estadoCivil = entrada.next();
										
			if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
				|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				validacao = true;
			} else {
				System.out.println("Informa��o invalida!");
			}
			
	    } while(!validacao);
		
		System.out.println("As informa��es foram validadas com as seguintes respostas!");
		System.out.println("Nome informado foi: "+nome);
		System.out.println("Idade informado foi: "+idade);
		System.out.println("Sal�rio informado foi: "+salario);
		System.out.println("Sexo informado foi: "+sexo);
		System.out.println("Estado civil informado foi: "+estadoCivil);
		
		entrada.close();

	}

}
