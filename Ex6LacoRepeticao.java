package EscrevaLeia;

import java.util.Scanner;

public class Ex6LacoRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escrever um programa que receba vários números inteiros no teclado. E no
		final imprimir a média dos números múltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)*/
		
		Scanner leia = new Scanner(System.in);
		
		int num,soma=0,cont=0;
		float media;
		
		System.out.println("\nInforme um número: ");
		num = leia.nextInt();
		
		do {
			if(num%3==0) {
				cont++;
				soma = soma + num;
			}
			
			System.out.println("\nInforme um número: ");
			num = leia.nextInt();
			
		}while(num != 0);
		
		media = soma/cont;
		System.out.printf("\nA média dos múltiplos de 3 são: %2.2f",media);
		
	}

}
