import java.util.Scanner;

public class at25ex2 {

	public static void main(String[] args) {
		/*
		 Fa�a um Programa que pe�a um n�mero inteiro e determine se ele � par ou impar. 
		 Dica: utilize o operador m�dulo (resto da divis�o).
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		int num = entrada.nextInt();
		
		if (num % 2 == 0)
			System.out.println("Par");
		else
			System.out.println("�mpar");
		
		entrada.close();
		
	}

}
