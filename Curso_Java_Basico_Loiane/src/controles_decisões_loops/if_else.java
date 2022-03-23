package controles_decisões_loops;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana:");
		int diaDaSemana = entrada.nextInt();
		
		if(diaDaSemana==1) {
			System.out.println("É SEGUNDA-FEIRA!");
		}
		else if(diaDaSemana==2) {
			System.out.println("É TERÇA-FEIRA!");
		}
		else if(diaDaSemana==3) {
			System.out.println("É QUARTA-FEIRA!");
		}	
		else if(diaDaSemana==4) {
			System.out.println("É QUINTA-FEIRA!");
		}	
		else if(diaDaSemana==5) {
			System.out.println("ENTÃO SEXTOU, VAMOS CURTIR O SABADO E DOMINGO!");
		}	
		else if(diaDaSemana==6) {
			System.out.println("É SÁBADO!");
		}	
		else if(diaDaSemana==7) {
			System.out.println("É DOMINGO!");
		}	
		
	

	}

}
