package EscrevaLeia;

import java.util.Scanner;

public class Ex2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Fa�a um programa que receba 6 n�meros inteiros e mostre: 
			Os n�meros pares digitados;  
			A soma dos n�meros pares digitados; 
			Os n�meros �mpares digitados; 
			A quantidade de n�meros �mpares digitados.*/

		Scanner leia = new Scanner(System.in);
		
		int numeros[] = new int[6];
		int x,somapar=0,contimpar=0;
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nInsira um n�mero: ");
			numeros[x]=leia.nextInt();
		}
		
		for(x=0;x<6;x++)
		{
			if(numeros[x]%2 == 0)
			{
				System.out.printf("\n %d � Par",numeros[x]);
				somapar += numeros[x];
			}else {
				System.out.printf("\n %d � �mpar", numeros[x]);
				contimpar++;
			}
		}
		
		System.out.printf("\nSoma dos n�meros pares: %d", somapar);
		System.out.printf("\nQuantidade de n�meros �mpares: %d",contimpar);
		
	}

}
