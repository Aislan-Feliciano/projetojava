package controles_decisões_loops;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite dia da semana:");
		int diaDaSemana = entrada.nextInt();
		
		switch(diaDaSemana) {
		case 1: System.out.println("segunda-feira");break;
		case 2: System.out.println("tercira-feira");break;
		case 3: System.out.println("quarta-feira");break;
		case 4: System.out.println("quinta-feira");break;
		case 5: System.out.println("Então sextou! Vamos curti o sábado e domindo!");break;
		case 6: System.out.println("sabado");break;
		case 7: System.out.println("domingo");break;
		default: System.out.println("número invalido!");
		
		}
		
		

	}

}
