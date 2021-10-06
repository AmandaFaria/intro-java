package EscrevaLeia;

import java.util.Scanner;

public class Ex2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Faça um programa que receba 6 números inteiros e mostre: 
			Os números pares digitados;  
			A soma dos números pares digitados; 
			Os números ímpares digitados; 
			A quantidade de números ímpares digitados.*/

		Scanner leia = new Scanner(System.in);
		
		int numeros[] = new int[6];
		int x,somapar=0,contimpar=0;
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nInsira um número: ");
			numeros[x]=leia.nextInt();
		}
		
		for(x=0;x<6;x++)
		{
			if(numeros[x]%2 == 0)
			{
				System.out.printf("\n %d é Par",numeros[x]);
				somapar += numeros[x];
			}else {
				System.out.printf("\n %d é Ímpar", numeros[x]);
				contimpar++;
			}
		}
		
		System.out.printf("\nSoma dos números pares: %d", somapar);
		System.out.printf("\nQuantidade de números ímpares: %d",contimpar);
		
	}

}
