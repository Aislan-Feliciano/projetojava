package ExercAula017;

import java.util.Scanner;

public class Exerc002 {

	public static void main(String[] args) {
		/*2. Fa�a um programa que leia um nome de usu�rio e a sua senha
		e n�o aceite a senha igual ao nome do usu�rio, mostrando uma 
		mensagem de erro e voltando a pedir as informa��es*/
		
		Scanner entrada = new Scanner(System.in);
		
		boolean login = false;
		
		do {
			System.out.println("Digite seu nome:");
			String nome = entrada.next();
			
			System.out.println("Insira uma senha:");
			String senha = entrada.next();
			
			if(nome.equalsIgnoreCase(senha)) {
				System.out.println("Nome ou senha incorreto, tente novamente!");
				System.out.println("------------");
			} else {
				System.out.println("login correto!");
				login = true;
			}
			
		}while(!login);
	

	}

}
