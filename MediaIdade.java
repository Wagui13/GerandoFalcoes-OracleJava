import java.util.Scanner;

public class MediaIdade {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Que ano tu nasceu? (1)");
		int ano1 = input.nextInt();
			
		System.out.println("Que ano tu nasceu? (2)");
		int ano2 = input.nextInt();
		
		System.out.println("Que ano tu nasceu? (3)");
		int ano3 = input.nextInt();
		
		// com funcao
		//int media = calculoIdade(ano1, ano2, ano3);
		
		// sem funcao
		int idade1 = 2021 - ano1;
		int idade2 = 2021 - ano2;
		int idade3 = 2021 - ano3;
		int media = (idade1 + idade2 + idade3) / 3;
						
		System.out.println("\nA média de idade é " + media);
		
		input.close();
	}
	
	public static int calculoIdade(int ano1, int ano2, int ano3) 
	{
		int idade1 = 2021 - ano1;	
		int idade3 = 2021 - ano1;
		int idade2 = 2021 - ano1;
		
		return (idade1 + idade2 + idade3)/3;
	}
	
}