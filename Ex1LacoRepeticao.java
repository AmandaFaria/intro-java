package EscrevaLeia;

public class Ex1LacoRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
		obtemos resto = 5. (FOR)*/
		
		int x;
		
		for(x=1000;x<=1999;x++)
		{
			if(x%11==5)
			{
				System.out.printf("\n%d",x);
			}
		}
		
	}

}
