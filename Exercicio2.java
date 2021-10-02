package EscrevaLeia;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int dia,idadeAnos,idadeMes,idadeDias;
		System.out.println("\nInforme seus dias vividos: ");
		dia = leia.nextInt();
		
		idadeAnos = dia/365;
		idadeMes = (dia%365)/30;
		idadeDias = (dia%365)%30;
		
		System.out.printf("\nSua idade em anos: %d anos.\nMeses: %d\nDias: %d", idadeAnos,idadeMes,idadeDias);
	}

}
