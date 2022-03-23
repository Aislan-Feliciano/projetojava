package ExercAula013;

import java.util.Scanner;

public class ExercTeste {
	
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3, soma;
		
		System.out.println("Digite 1 para SOMA: ");
		System.out.println("Digite 2 para SUBTRAÇÃO");
		num3 = entrada.nextInt();
		
		System.out.println("Insira o primeiro valor: ");
		num1 = entrada.nextInt();
		
		System.out.println("Insira o segundo valor: ");
		num2 = entrada.nextInt();
		
		if(num3 == 1) {
			System.out.println("VAMOS SOMAR!");			
			System.out.println("SOMA entre " +num1+ " e " +num2+ " = " +(num1 + num2));
			soma = entrada.nextInt();
		}
		else if(num3 == 2) {
			System.out.println(" VAMOS SUBTRAIR!");
			System.out.println("A SUBTRAÇÃO entre "+num1+ " e " +num2+ " = " +(num1 - num2));
			soma = entrada.nextInt();
		}
		else {
			System.out.println("VERIFIQUE SE O NÚMERO INSERIDO ESTA CORRETO, TENTE NOVAMENTE!");
			entrada.close();
		}
		
			
		
		
	}

}
