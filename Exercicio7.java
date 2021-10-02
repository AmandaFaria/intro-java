package EscrevaLeia;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		float a,b,c,d,e,f,x,y;
		
		System.out.println("Informe o valor de A: ");
		a=leia.nextFloat();
		System.out.println("Informe o valor de B: ");
		b=leia.nextFloat();
		System.out.println("Informe o valor de C: ");
		c=leia.nextFloat();
		System.out.println("Informe o valor de D: ");
		d=leia.nextFloat();
		System.out.println("Informe o valor de E: ");
		e=leia.nextFloat();
		System.out.println("Informe o valor de F: ");
		f=leia.nextFloat();
		
		x= ((c*e)-(b*f))/((a*e)-(b*d));
		y=((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.printf("X = %2.2f e Y = %2.2f", x,y);
	}

}
