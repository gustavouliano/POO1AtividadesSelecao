import java.util.Scanner;

public class at20 {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a um n�mero correspondente a um determinado ano e em
		// seguida informe se este ano � ou n�o bissexto.

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um ano: ");
		int ano = entrada.nextInt();
		
		if (((ano % 4 == 0) && (ano % 100 != 0)) || ((ano % 4 == 0) && (ano % 100 == 0) && (ano % 400 == 0)))
			System.out.println("� ano bissexto");
		else
			System.out.println("N�o � ano bissexto");
		
		entrada.close();
		
	}

}
