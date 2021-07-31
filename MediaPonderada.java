import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a nota 1:");
		float nota1 = input.nextFloat();
		System.out.println("Informe o peso da nota 1:");
		float peso1 = input.nextFloat();
		
		System.out.println("Informe a nota 2:");
		float nota2 = input.nextFloat();
		System.out.println("Informe o peso da nota 2:");
		float peso2 = input.nextFloat();
		
		System.out.println("Informe a nota 3:");
		float nota3 = input.nextFloat();
		System.out.println("Informe o peso da nota 3:");
		float peso3 = input.nextFloat();
		
		float mediaPonderada = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1 + peso2 + peso3);
		
		System.out.println("A média ponderada é: " + mediaPonderada);
		
		input.close();
	}

}
