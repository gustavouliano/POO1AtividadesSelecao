import java.util.Scanner;

public class at20 {

	public static void main(String[] args) {
		// Faça um Programa que peça um número correspondente a um determinado ano e em
		// seguida informe se este ano é ou não bissexto.

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um ano: ");
		int ano = entrada.nextInt();
		
		if (((ano % 4 == 0) && (ano % 100 != 0)) || ((ano % 4 == 0) && (ano % 100 == 0) && (ano % 400 == 0)))
			System.out.println("É ano bissexto");
		else
			System.out.println("Não é ano bissexto");
		
		entrada.close();
		
	}

}
