package Level1;

import java.util.Scanner;

public class Frase {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		mostrarTextoDeBoasVindas();
		System.out.print("Digita um numero: ");
		int num = input.nextInt();
		
		calcularTabuada(num);
		
		mostrarDespedida();
		
		input.close();
	}
	
	static void mostrarTextoDeBoasVindas() {
		
		System.out.println("Ola, como voce vai?");
		
	}
	
	static void calcularTabuada(int num) {

		System.out.println("\nTabuada do "+num+" na tua cara ai:");
		for(int i = 1; i < 11; i++) {
			System.out.println(num + "x" + i + " = " + num*i);
		}
	}
	
	static void mostrarDespedida() {
		
		System.out.println("\nAte mais");
		
	}
}