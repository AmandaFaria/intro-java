package EscrevaLeia;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		float custoFabrica;
		double custoConsumidor;
		
		System.out.println("Informe o valor do custo de fábrica: ");
		custoFabrica = leia.nextFloat();
		
		custoConsumidor = (custoFabrica*0.45)+0.28;
		
		System.out.printf("O custo do consumidor vai ser de R$%2.2f", custoConsumidor);
	}

}
