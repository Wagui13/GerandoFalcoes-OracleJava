package Level1;

import java.util.Scanner;

public class RendaSalarial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Renda salarial da pessoa 1: R$");
		double renda1 = input.nextDouble();
		
		System.out.print("Renda salarial da pessoa 2: R$");
		double renda2 = input.nextDouble();
		
		calcularTotalDaRendaSalarial(renda1, renda2);
		
		input.close();
	}
	
	static void calcularTotalDaRendaSalarial(double renda1, double renda2) {
		double totalRenda = renda1 + renda2;
		System.out.println("Total da renda salarial das duas pessoas: R$"+ totalRenda);
	}

}