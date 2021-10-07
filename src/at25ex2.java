import java.util.Scanner;

public class at25ex2 {

	public static void main(String[] args) {
		/*
		 Faça um Programa que peça um número inteiro e determine se ele é par ou impar. 
		 Dica: utilize o operador módulo (resto da divisão).
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = entrada.nextInt();
		
		if (num % 2 == 0)
			System.out.println("Par");
		else
			System.out.println("Ímpar");
		
		entrada.close();
		
	}

}
