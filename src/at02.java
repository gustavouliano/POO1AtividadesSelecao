import java.util.Scanner;

public class at02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		double num = entrada.nextDouble();
		
		if (num > 0)
			System.out.println("Positivo.");
		else if (num < 0)
			System.out.println("Negativo.");
		else
			System.out.println("Zero.");
		
		entrada.close();
	}

}
