import java.util.Scanner;
import java.lang.Math;

public class at26 {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a um n�mero e informe se o n�mero � inteiro ou decimal.
		// Dica: utilize uma fun��o de arredondamento.

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		double num = entrada.nextDouble();
		
		if (Math.ceil(num) != num)
			System.out.println("O n�mero � decimal.");
		else
			System.out.println("O n�mero � inteiro.");
		
		entrada.close();
		
	}

}
