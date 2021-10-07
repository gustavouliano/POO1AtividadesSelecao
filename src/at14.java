import java.util.Scanner;

public class at14 {

	public static void main(String[] args) {
		// Faça um Programa que leia um número e exiba o dia correspondente da semana.
		// (1- Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Número [1 até 7]: ");
		int numero = entrada.nextInt();
		
		if (numero == 1)
			System.out.println("Domingo");
		else if (numero == 2)
			System.out.println("Segunda");
		else if (numero == 3)
			System.out.println("Terça");
		else if (numero == 4)
			System.out.println("Quarta");
		else if (numero == 5)
			System.out.println("Quinta");
		else if (numero == 6)
			System.out.println("Sexta");
		else if (numero == 7)
			System.out.println("Sábado");
		else
			System.out.println("Valor inválido");
		
		entrada.close();
		
	}

}
