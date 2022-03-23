package ExercAula015;

import java.util.Scanner;

public class Exerc016 {

	public static void main(String[] args) {
	/*16.Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax² + bx + c = 0.
	   O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas
	   seguintes situações: 
	   a. Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer
	   pedir os demais valores, sendo encerrado;
	   b. Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa; 
	   c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
	   d. Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;*/ 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int a = entrada.nextInt();
		
		System.out.println("Digite o valor de B:");
		int b = entrada.nextInt();
		
		System.out.println("Digite o valor de C:");
		int c = entrada.nextInt();
		
	    double delta = (b*b) - (4*a*c);
	    double x1 = ((-b) + (Math.sqrt(delta)) / (2*a));
	    double x2 = ((-b) - (Math.sqrt(delta)) / (2*a));
	    
	    if(a==0) {
	    	System.out.println("Valor de delta "+delta);
	    	System.out.println("A equação não é do segundo grau, programa encerrado!");
	    	System.out.println("O valor x1 "+x1);
	    	System.out.println("O valor x2 "+x2);
	    }
	    else if(delta<0) {
	    	System.out.println("Valor de delta "+delta);
	    	System.out.println("A equação não possui raizes reais, programa encerrado!");
	    	System.out.println("O valor x1 "+x1);
	    	System.out.println("O valor x2 "+x2);
	    }
	    else if(delta==0) {
	    	System.out.println("Valor de delta "+delta);
	    	System.out.println("A equação possui apenas uma raiz real!");
	    	System.out.println("O valor x1 "+x1);
	    	System.out.println("O valor x2 "+x2);
	    }
	    else if(delta>0) {
	    	System.out.println("Valor de delta "+delta);
	    	System.out.println("A equação possui duas raizes reais");
	    	System.out.println("O valor x1 "+x1);
	    	System.out.println("O valor x2 "+x2);
	    }
		
	    entrada.close();

	}

}
