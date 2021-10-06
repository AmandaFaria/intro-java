package EscrevaLeia;

import java.util.Scanner;

public class Ex5LacoRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crie um programa que leia um número do teclado até que encontre um
		número igual a zero. No final, mostre a soma dos números
		digitados.(DO...WHILE)*/
		
		Scanner leia = new Scanner(System.in);
		
		int num,soma=0;
		
		System.out.println("\nInforme um número: ");
		num = leia.nextInt();
		
		do {
				soma = soma + num;			
			
			System.out.println("\nInforme um número: ");
			num = leia.nextInt();
			
		}while(num != 0);
		
		System.out.printf("\nA média dos múltiplos de 3 são: %d",soma);
		
	}

}
