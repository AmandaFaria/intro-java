package EscrevaLeia;

import java.util.Scanner;

public class Ex2LacoRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		Scanner leia = new Scanner(System.in);
		int x,num,contpar=0,contimpar=0;
		
		for(x=1;x<=4;x++)
		{
			System.out.println("\nInforme um n�mero: ");
			num = leia.nextInt();
			
			if(num%2==0) {
				contpar++;
			}else {
				contimpar++;
			}
		}
		
		System.out.printf("\nQuantidade de Pares: %d\nQuantidade de �mpares: %d",contpar,contimpar);
	}

}
