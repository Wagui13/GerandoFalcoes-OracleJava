import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o seu peso (em quilos): ");
		float peso = input.nextFloat();
		
		System.out.println("Agora informe sua (altura em metros): ");
		float altura = input.nextFloat();		
		
		float imc = peso / (altura * altura);
		
		System.out.println("Seu IMC é: " + imc);
		
		input.close();
	}
}
