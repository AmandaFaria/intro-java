package EscrevaLeia;

import java.util.Scanner;

public class Ex4LacoCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		float num;
		
		System.out.println("\nInforme um número: ");
		num = leia.nextFloat();
		
		if(num%2 == 0)
		{
			System.out.printf("\n%2.2f é par!",num);
			num = (float) Math.sqrt(num);
			System.out.printf("\nA raíz quadrada é: %2.2f",num);
		}else {
			System.out.println("\nEsse número é ímpar");
			num = (float) Math.pow(num, 2);
			System.out.printf("\nO número ao quadrado é: %2.2f", num);
		}

	}

}
