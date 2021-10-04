package EscrevaLeia;

import java.util.Scanner;

public class Ex2LacoCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		float n1,n2,n3;
		
		System.out.println("\nInforme o primeiro número: ");
		n1 = leia.nextFloat();
		System.out.println("\nInforme o segundo número: ");
		n2 = leia.nextFloat();
		System.out.println("\nInforme o terceiro número: ");
		n3 = leia.nextFloat();
		
		if(n1<n2 && n1<n3 && n2<n3)
		{
			System.out.printf("\n%2.2f < %2.2f < %2.2f",n1,n2,n3);
		}else if(n1<n3 && n1<n2 && n3<n2)
		{
			System.out.printf("\n%2.2f < %2.2f < %2.2f",n1,n3,n2);
		}else if(n2<n1 && n2<n3 && n1<n3)
		{
			System.out.printf("\n%2.2f < %2.2f < %2.2f",n2,n1,n3);
		}else if(n2<n1 && n2<n3 && n3<n1)
		{
			System.out.printf("\n%2.2f < %2.2f < %2.2f",n2,n3,n1);
		}else if(n3<n1 && n3<n2 && n1<n2)
		{
			System.out.printf("\n%2.2f < %2.2f < %2.2f",n3,n1,n2);
		}else
		{
			System.out.printf("\n%2.2f < %2.2f < %2.2f",n3,n2,n1);
		}
	}

}
