package ExercAula015;

import java.util.Scanner;

public class Exerc016 {

	public static void main(String[] args) {
	/*16.Fa�a um programa que calcule as ra�zes de uma equa��o do segundo grau, na forma ax� + bx + c = 0.
	   O programa dever� pedir os valores de a, b e c e fazer as consist�ncias, informando ao usu�rio nas
	   seguintes situa��es: 
	   a. Se o usu�rio informar o valor de A igual a zero, a equa��o n�o � do segundo grau e o programa n�o deve fazer
	   pedir os demais valores, sendo encerrado;
	   b. Se o delta calculado for negativo, a equa��o n�o possui raizes reais. Informe ao usu�rio e encerre o programa; 
	   c. Se o delta calculado for igual a zero a equa��o possui apenas uma raiz real; informe-a ao usu�rio;
	   d. Se o delta for positivo, a equa��o possui duas raiz reais; informe-as ao usu�rio;*/ 
		
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
	    	System.out.println("A equa��o n�o � do segundo grau, programa encerrado!");
	    	System.out.println("O valor x1 "+x1);
	    	System.out.println("O valor x2 "+x2);
	    }
	    else if(delta<0) {
	    	System.out.println("Valor de delta "+delta);
	    	System.out.println("A equa��o n�o possui raizes reais, programa encerrado!");
	    	System.out.println("O valor x1 "+x1);
	    	System.out.println("O valor x2 "+x2);
	    }
	    else if(delta==0) {
	    	System.out.println("Valor de delta "+delta);
	    	System.out.println("A equa��o possui apenas uma raiz real!");
	    	System.out.println("O valor x1 "+x1);
	    	System.out.println("O valor x2 "+x2);
	    }
	    else if(delta>0) {
	    	System.out.println("Valor de delta "+delta);
	    	System.out.println("A equa��o possui duas raizes reais");
	    	System.out.println("O valor x1 "+x1);
	    	System.out.println("O valor x2 "+x2);
	    }
		
	    entrada.close();

	}

}
