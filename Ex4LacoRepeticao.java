package EscrevaLeia;

import java.util.Scanner;

public class Ex4LacoRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
		psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		o n�mero de pessoas calmas;
		o n�mero de mulheres nervosas;
		o n�mero de homens agressivos;
		o n�mero de outros calmos;
		o n�mero de pessoas nervosas com mais de 40 anos;
		o n�mero de pessoas calmas com menos de 18 anos.*/
		
		Scanner leia = new Scanner(System.in);
		
		int idade,genero,pessoas=0,carac,contFcalma=0,contFnervosa=0,contFagressiva=0,contMcalmo=0,contMnervoso=0,contMagressivo=0,contOcalme=0,contOnervose=0,contOagressive=0;
		int contFnervosa40=0,contMnervoso40=0,contOnervose40=0,contOcalme18=0,contMcalmo18=0,contFcalma18=0,somaCalme,somaNervMais40,somaCalm18;
		
		while(pessoas<=2)
		{
			System.out.println("\nInforme sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nInforme seu g�nero:\n1-Feminino\n2-Masculino\n3-Outros");
			genero = leia.nextInt();
			switch(genero)
			{
				case 1: System.out.println("\nInforme sua carcter�stica:\n1-Calma\n2-Nervosa\n3-Agressiva");
						carac = leia.nextInt();
						if(carac == 1)
						{
							contFcalma++;
							if(idade < 18) {
								contFcalma18++;
							}							
						}else if(carac == 2)
						{
							contFnervosa++;
							if(idade > 40) {
								contFnervosa40++;
							}
						}else if(carac == 3) {
							contFagressiva++;
						}
						break;
				case 2: System.out.println("\nInforme sua carcter�stica:\n1-Calmo\n2-Nervoso\n3-Agressivo");
						carac = leia.nextInt();
						if(carac == 1)
						{
							contMcalmo++;
							if(idade < 18) {
								contMcalmo18++;
							}
						}else if(carac == 2)
						{
							contMnervoso++;
							if(idade > 40) {
								contMnervoso40++;
							}
						}else if(carac == 3) {
							contMagressivo++;
						}
						break;
				case 3: System.out.println("\nInforme sua carcter�stica:\n1-Calme\n2-Nervose\n3-Agressive");
						carac = leia.nextInt();
						if(carac == 1)
						{
							contOcalme++;
							if(idade < 18) {
								contOcalme18++;
							}
						}else if(carac == 2)
						{
							contOnervose++;
							if(idade > 40) {
								contOnervose40++;
							}
						}else if(carac == 3){
							contOagressive++;
						}
						break;
				default: System.out.println("\nOp��o inv�lida!!");
			}
			pessoas++;
		}
		
		somaCalme = contFcalma + contMcalmo + contOcalme;
		somaNervMais40 = contFnervosa40 + contMnervoso40 + contOnervose40;
		somaCalm18 = contFcalma18 + contMcalmo18 + contOcalme18;
		
		System.out.printf("\nO n�mero de pessoas calmes: %d", somaCalme);
		System.out.printf("\nO n�mero de mulheres nervosas: %d",contFnervosa);
		System.out.printf("\nO n�mero de homens agressivos: %d", contMagressivo);
		System.out.printf("\nO n�mero de outros calmes: %d", contOcalme);
		System.out.printf("\nO n�mero de pessoas nervoses com mais de 40 anos: %d", somaNervMais40);
		System.out.printf("\nO n�mero de pessoas calmes com menos de 18 anos: %d", somaCalm18);

	}

}
