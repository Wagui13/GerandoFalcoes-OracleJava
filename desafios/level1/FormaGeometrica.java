package Level1;

import java.util.Scanner;

public class FormaGeometrica {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Raio do circulo: ");
		double raio = input.nextDouble();
		
		calcularAreaCirculo(raio);
		
		System.out.print("\n\nBase do retangulo: ");
		double base = input.nextDouble();
		System.out.print("Altura do retangulo: ");
		double altura = input.nextDouble();
		
		calcularAreaRetangulo(base, altura);
		
		input.close();
	}
	
	static void calcularAreaCirculo(double raio) {
		double a = Math.PI * Math.pow(raio, 2);
		System.out.printf("Valor da area do circulo: %.2f", a);
	}
	
	static void calcularAreaRetangulo(double base, double altura) {
		double a = base * altura; 
		System.out.printf("Valor da area do retangulo: %.2f", a);
	}
}