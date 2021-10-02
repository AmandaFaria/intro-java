package EscrevaLeia;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		float x1,x2,y1,y2;
		double p1,p2,d;
				
		System.out.println("Digite o calor de X1: ");
		x1 = leia.nextFloat();
		System.out.println("Digite o calor de X2: ");
		x2 = leia.nextFloat();
		System.out.println("Digite o calor de Y1: ");
		y1 = leia.nextFloat();
		System.out.println("Digite o calor de Y2: ");
		y2 = leia.nextFloat();
		
		p1 = Math.pow(x2-x1, 2);
		p2 = Math.pow(y2-y1, 2);
		d = Math.sqrt(p1+p2);
		
		System.out.printf("A distância entre os dois pontos é %2.2f", d);
	}

}
