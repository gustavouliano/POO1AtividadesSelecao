import java.util.Scanner;

public class at07 {

	public static void main(String[] args) {
		// Fa�a um Programa que leia tr�s n�meros e mostre-os em ordem decrescente.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Primeiro n�mero: ");
		double num1 = entrada.nextDouble();
		System.out.print("Segundo n�mero: ");
		double num2 = entrada.nextDouble();
		System.out.print("Terceiro n�mero: ");
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
