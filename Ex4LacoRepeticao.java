package EscrevaLeia;

import java.util.Scanner;

public class Ex4LacoRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		o número de pessoas calmas;
		o número de mulheres nervosas;
		o número de homens agressivos;
		o número de outros calmos;
		o número de pessoas nervosas com mais de 40 anos;
		o número de pessoas calmas com menos de 18 anos.*/
		
		Scanner leia = new Scanner(System.in);
		
		int idade,genero,pessoas=0,carac,contFcalma=0,contFnervosa=0,contFagressiva=0,contMcalmo=0,contMnervoso=0,contMagressivo=0,contOcalme=0,contOnervose=0,contOagressive=0;
		int contFnervosa40=0,contMnervoso40=0,contOnervose40=0,contOcalme18=0,contMcalmo18=0,contFcalma18=0,somaCalme,somaNervMais40,somaCalm18;
		
		while(pessoas<=2)
		{
			System.out.println("\nInforme sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nInforme seu gênero:\n1-Feminino\n2-Masculino\n3-Outros");
			genero = leia.nextInt();
			switch(genero)
			{
				case 1: System.out.println("\nInforme sua carcterística:\n1-Calma\n2-Nervosa\n3-Agressiva");
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
				case 2: System.out.println("\nInforme sua carcterística:\n1-Calmo\n2-Nervoso\n3-Agressivo");
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
				case 3: System.out.println("\nInforme sua carcterística:\n1-Calme\n2-Nervose\n3-Agressive");
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
				default: System.out.println("\nOpção inválida!!");
			}
			pessoas++;
		}
		
		somaCalme = contFcalma + contMcalmo + contOcalme;
		somaNervMais40 = contFnervosa40 + contMnervoso40 + contOnervose40;
		somaCalm18 = contFcalma18 + contMcalmo18 + contOcalme18;
		
		System.out.printf("\nO número de pessoas calmes: %d", somaCalme);
		System.out.printf("\nO número de mulheres nervosas: %d",contFnervosa);
		System.out.printf("\nO número de homens agressivos: %d", contMagressivo);
		System.out.printf("\nO número de outros calmes: %d", contOcalme);
		System.out.printf("\nO número de pessoas nervoses com mais de 40 anos: %d", somaNervMais40);
		System.out.printf("\nO número de pessoas calmes com menos de 18 anos: %d", somaCalm18);

	}

}
