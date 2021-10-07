import java.util.Scanner;

public class at07 {

	public static void main(String[] args) {
		// Faça um Programa que leia três números e mostre-os em ordem decrescente.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Primeiro número: ");
		double num1 = entrada.nextDouble();
		System.out.print("Segundo número: ");
		double num2 = entrada.nextDouble();
		System.out.print("Terceiro número: ");
		double num3 = entrada.nextDouble();
		
		if ((num1 >= num2) && (num1 >= num3)) {
			if (num2 >= num3)
				System.out.println(num1 + " - " + num2 + " - " + num3);
			else
				System.out.println(num1 + " - " + num3 + " - " + num2);
		}
		else if ((num2 >= num1) && (num2 >= num3)) {
			if (num1 >= num3)
				System.out.println(num2 + " - " + num1 + " - " + num3);
			else
				System.out.println(num2 + " - " + num3 + " - " + num1);
		}
		else
			if (num1 >= num2)
				System.out.println(num3 + " - " + num1 + " - " + num2);
			else
				System.out.println(num3 + " - " + num2 + " - " + num1);
		
		entrada.close();
		
	}

}
