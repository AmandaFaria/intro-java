package EscrevaLeia;

import java.util.Scanner;

public class Ex3LacoRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)*/
		
		Scanner leia = new Scanner(System.in);
		int idade,cont21=0,cont50=0;
		
		System.out.println("\nInforme a sua idade: ");
		idade = leia.nextInt();
		
		while(idade != -99){
			
			if(idade<=21 && idade>=0)
			{
				cont21++;
			}else if(idade>50)
			{
				cont50++;
			}
			
			System.out.println("\nInforme a sua idade: ");
			idade = leia.nextInt();
		}
		
		System.out.printf("\nA quantidade de pessoas com menos de 21 são: %d",cont21);
		System.out.printf("\nA quantidade de pessoas com mais de 50 são: %d",cont50);

	}

}
