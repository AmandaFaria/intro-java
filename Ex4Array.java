package EscrevaLeia;

import java.util.Scanner;

public class Ex4Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Faça um programa que leia duas matrizes 2 x 2 com valores reais. 
		 Ofereça ao usuário um menu de opções:
			 (1) somar as duas matrizes 
			 (2) subtrair a primeira matriz da segunda 
			 (3) adicionar uma constante as duas matrizes
			 (4) imprimir as matrizes 
			 Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada.
			 Na terceira opção o valor da constante deve ser lido e o resultado
			 da adição da constante deve ser armazenado na própria matriz. */
		
		Scanner leia = new Scanner(System.in);
		
		float M1[][] = new float[2][2];
		float M2[][] = new float[2][2];
		float M3[][] = new float[2][2];
		int x,y,op,constante;
		
		for(x=0;x<2;x++)
		{
			for(y=0;y<2;y++)
			{
				System.out.printf("\nInforme um valor para Matriz1[%d][%d]",x+1,y+1);
				M1[x][y] = leia.nextFloat();
				System.out.printf("\nInforme um valor para Matriz2[%d][%d]",x+1,y+1);
				M2[x][y] = leia.nextFloat();
			}
		}
		
		System.out.println("\n\t\tMENU");
		System.out.println("\nEscolha uma das opções abaixo:");
		System.out.println("\n1-Somar duas matrizes\n2-Subtrair duas matrizes\n3-Adicionar uma constante\n4-Imprimir as matrizes");
		System.out.println("\nDigite sua opção: ");
		op = leia.nextInt();
		
		while(op<1 || op>4)//Ele entra no laço caso ele coloque nº que não estão entre 1 e 4
		{
			System.out.println("\n\t\tMENU");
			System.out.println("\nEscolha uma das opções abaixo:");
			System.out.println("\n1-Somar duas matrizes\n2-Subtrair duas matrizes\n3-Adicionar uma constante\n4-Imprimir as matrizes");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();
		}
		
		do {
			switch(op)
			{
				case 1: for(x=0;x<2;x++)
						{
							for(y=0;y<2;y++)
							{
								M3[x][y] = M1[x][y] + M2[x][y];
								System.out.printf("\nSoma das matrizes: %2.2f",M3[x][y]);
							}
						}
				break;
				case 2: for(x=0;x<2;x++)
				{
					for(y=0;y<2;y++)
					{
						M3[x][y] = M1[x][y] - M2[x][y];
						System.out.printf("\nDiferença das matrizes: %2.2f",M3[x][y]);
					}
				}
				break;
				case 3: System.out.println("\nEntre com um número: ");
						constante = leia.nextInt();
						for(x=0;x<2;x++)
						{
							for(y=0;y<2;y++)
							{
								M1[x][y] += constante;
								M2[x][y] += constante;
								System.out.printf("\nMatriz 1: %2.2f\nMatriz 2: %2.2f",M1[x][y],M2[x][y]);
							}
						}
				break;
				case 4: for(x=0;x<2;x++)
						{
							for(y=0;y<2;y++)
							{
								System.out.printf("\nMatriz 1: %2.2f\nMatriz 2: %2.2f",M1[x][y],M2[x][y]);
							}
						}
				break;
				default: System.out.println("\nOpção Inválida!");				
			}
			//Aqui o usuário vai poder esolher uma opção de novo ou sair do programa
			System.out.println("\n\t\tMENU");
			System.out.println("\nEscolha uma das opções abaixo:");
			System.out.println("\n1-Somar duas matrizes\n2-Subtrair duas matrizes\n3-Adicionar uma constante\n4-Imprimir as matrizes\n0-Sair do Programa");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();		
			
		}while(op!=0);//Quando o usuário digitar 0 ele sai do programa
	
	}

}
