package EscrevaLeia;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idade,mes,dia,idadeDias,mesDias,totalDias;
		
		System.out.println("\nInforme a sua idade: ");
		idade = leia.nextInt();
		System.out.println("\nInforme o mês: ");
		mes = leia.nextInt();
		System.out.println("\nInforme o dia: ");
		dia = leia.nextInt();
		
		idadeDias = idade * 365;
		mesDias = mes * 30;
		totalDias = idadeDias + mesDias + dia;
		
		System.out.printf("\nSua idade em dias é: %d",totalDias);
	}

}
