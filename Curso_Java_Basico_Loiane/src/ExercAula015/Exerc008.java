package ExercAula015;

import java.util.Scanner;

public class Exerc008 {

	public static void main(String[] args) {
		/*8. Faça um programa que pergunte o preço de três produtos 
		 * e informe qual produto você deve comprar, sabendo que a 
		 * decisão é sempre pelo mais barato.*/ 
		
		//double idade = Double.parseDouble(entrada.nextLine()); converter para ponto 3.20
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual é preço do arroz?");
		double arroz = entrada.nextDouble();
		
		System.out.println("Qual é preço do feijão?");
		double feijao = entrada.nextDouble();
		
		System.out.println("Qual é preço do macarrão?");
		double macarrao = entrada.nextDouble();
		
		if(arroz < macarrao && arroz < feijao){
			System.out.println("O arroz é mais barato!");
			
		}else if(feijao < macarrao && feijao < arroz) {
			System.out.println("O feijão é mais barato!");
					
		}else if(macarrao < feijao && macarrao < arroz){
			System.out.println("O macarrão é mais barato!");
		}
		
		entrada.close();

		}

}
