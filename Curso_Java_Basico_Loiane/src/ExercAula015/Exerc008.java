package ExercAula015;

import java.util.Scanner;

public class Exerc008 {

	public static void main(String[] args) {
		/*8. Fa�a um programa que pergunte o pre�o de tr�s produtos 
		 * e informe qual produto voc� deve comprar, sabendo que a 
		 * decis�o � sempre pelo mais barato.*/ 
		
		//double idade = Double.parseDouble(entrada.nextLine()); converter para ponto 3.20
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual � pre�o do arroz?");
		double arroz = entrada.nextDouble();
		
		System.out.println("Qual � pre�o do feij�o?");
		double feijao = entrada.nextDouble();
		
		System.out.println("Qual � pre�o do macarr�o?");
		double macarrao = entrada.nextDouble();
		
		if(arroz < macarrao && arroz < feijao){
			System.out.println("O arroz � mais barato!");
			
		}else if(feijao < macarrao && feijao < arroz) {
			System.out.println("O feij�o � mais barato!");
					
		}else if(macarrao < feijao && macarrao < arroz){
			System.out.println("O macarr�o � mais barato!");
		}
		
		entrada.close();

		}

}
