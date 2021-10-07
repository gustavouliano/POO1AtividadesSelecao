import java.util.Scanner;
import java.lang.Math;

public class at26 {

	public static void main(String[] args) {
		// Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
		// Dica: utilize uma função de arredondamento.

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double num = entrada.nextDouble();
		
		if (Math.ceil(num) != num)
			System.out.println("O número é decimal.");
		else
			System.out.println("O número é inteiro.");
		
		entrada.close();
		
	}

}
