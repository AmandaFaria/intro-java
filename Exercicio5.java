package EscrevaLeia;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		float n1,n2,n3,mediaFinal;
		
		System.out.println("Digite a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("Digite a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("Digite a terceira nota: ");
		n3 = leia.nextFloat();
		
		mediaFinal = (2*n1+3*n2+5*n3)/(2+3+5);
		System.out.printf("Sua média final foi de %2.2f", mediaFinal);
	}

}
