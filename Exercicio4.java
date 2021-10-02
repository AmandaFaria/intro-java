package EscrevaLeia;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int a,b,c,d,r,s;
		
		
		System.out.println("\nInforme um valor inteiro e positivo para A: ");
		a = leia.nextInt();
		System.out.println("\nInforme um valor inteiro e positivo para B: ");
		b = leia.nextInt();
		System.out.println("\nInforme um valor inteiro e positivo para C: ");
		c = leia.nextInt();
		
		r=(int) Math.pow(a+b, 2);
		s=(int) Math.pow(b+c, 2);
		d=(r+s)/2;
		
		System.out.printf("\nO valor de D é igual à: %d", d);
		
		
	}

}
