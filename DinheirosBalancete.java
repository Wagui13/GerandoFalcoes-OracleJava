import java.util.Scanner;

public class DinheirosBalancete {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in); 
	
	System.out.print("Infome o valor da sua conta de água: R$");
	double agua = input.nextDouble();
	System.out.print("Infome o valor da sua conta de luz: R$");
	double luz = input.nextDouble();
	System.out.print("Infome o valor da sua conta de internet: R$");
	double internet = input.nextDouble();

	
	System.out.println("Água: R$"+agua+" Luz: R$"+luz+" Internet: R$"+internet);
	System.out.println("Total de dispesas: R$" + (agua + luz + internet));
	
	input.close();
}
}