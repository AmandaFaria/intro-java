package EscrevaLeia;

import java.util.Scanner;

public class Ex3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Leia uma matriz 3 x 3, conte e escreva quantos
		 valores maiores que 10 ela possui.*/
		
		Scanner leia = new Scanner(System.in);
		
		int num[][] = new int[3][3];
		int x,y,cont = 0;
		
		for(x=0;x<3;x++)
		{
			for(y=0;y<3;y++)
			{
				System.out.printf("\nInforme o valor da Matriz[%d][%d]: ",x+1,y+1);
				num[x][y] = leia.nextInt();
			}
		}
		
		for(x=0;x<3;x++)
		{
			for(y=0;y<3;y++)
			{
				if(num[x][y] > 10)
				{
					cont++;
				}
			}
		}
		
		System.out.printf("\nA Matriz 3x3 possuí %d valores maiores que 10",cont);
	}

}
