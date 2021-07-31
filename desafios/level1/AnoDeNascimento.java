package Level1;

import java.util.Scanner;

public class AnoDeNascimento {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Quantos anos voce tem?");
		int idade = input.nextInt();
		
		calcularAnoDeNascimento(idade);
		
		input.close();
	}
	
	static void calcularAnoDeNascimento(int idade) {
		int nasc = 2021 - idade;
		System.out.println("Entao eu sei que voce nasceu no ano de " + nasc);
	}

}