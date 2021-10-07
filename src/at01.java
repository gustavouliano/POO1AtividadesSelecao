import java.util.Scanner;

public class at01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Primeiro número: ");
		double num = entrada.nextDouble();
		System.out.print("Segundo número: ");
		double num2 = entrada.nextDouble();
		
		if (num > num2)
			System.out.println("Maior: " + num);
		else if (num2 > num)
			System.out.println("Maior: " + num2);
		else
			System.out.println("Mesmo valor");
		
		
		entrada.close();
		
	}

}
