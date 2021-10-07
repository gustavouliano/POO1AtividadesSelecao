import java.util.Scanner;

public class at06 {

	public static void main(String[] args) {
		// Faça um Programa que peça um número inteiro e se este número for par, transforme-o em impar e vice-versa.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = entrada.nextInt();
		
		num = num + 1;  // já transformo o num aqui
		
		if (num % 2 == 0) {
			System.out.println("Virou par: " + num);
		}
		else {
			System.out.println("Virou ímpar: " + num);
		}		
		
		entrada.close();
		
	}

}
