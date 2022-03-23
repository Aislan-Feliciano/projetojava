package ExercAula015;

import java.util.Scanner;

public class Exerc_test {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva alguma letra do alfabeto:");
		String letra = entrada.nextLine();
		
		/*	if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("Vogal!");
		} else {
			System.out.println("Consoante!");
		}*/	
		//Para String não se utiliza o comparador "==" se utiiza equalsIgnoreCase()
			
			/*switch(letra) {
			case" A":
			case "E":
			case "I":
			case "O":
			case "U":
			case "a":
			case "e":
			case "i":
			case "o":
			case "u": System.out.println("vogal");break;
			default: System.out.println("consoante");
		    }*/
		
		if(letra.length() > 1) {
			System.out.println("letra invalida");
		} else {
			switch(letra) {
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
			case "a":
			case "e":
			case "i":
			case "o":
			case "u": System.out.println("vogal");break;
			default: System.out.println("consoante");
		    }		
		}
	}

}
