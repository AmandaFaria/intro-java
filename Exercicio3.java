package EscrevaLeia;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in); 
		
		int segundo,minuto,hora;
		
		System.out.println("\nQuantas horas de duração tem o evento em segundos? "); 
		segundo = leia.nextInt();
		
		minuto = segundo/60;
		hora=segundo/3600;
		
		System.out.printf("\nO envento irá durar %dh %dmin %dseg", hora,minuto,segundo); 
	}

}
