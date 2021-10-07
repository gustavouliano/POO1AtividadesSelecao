import java.util.Scanner;
import java.lang.Math;

public class at27 {

	public static void main(String[] args) {
		/*
		 Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação
		ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
			par ou ímpar;
			positivo ou negativo;
			inteiro ou decimal.
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("1° número: ");
		double n1 = entrada.nextDouble();
		System.out.print("2° número: ");
		double n2 = entrada.nextDouble();
		
		System.out.println("[1] - Soma"
				+ "\n[2] - Multiplicação");
		int escolha = entrada.nextInt();
		
		double resultado = 0;
		String parImpar, positivNegativ, intDecimal;
		
		if (escolha == 1) {
			resultado = n1 + n2;
		}else if (escolha == 2) {
			resultado = n1 * n2;
		}else {
			System.out.println("Escolha inválida");
			System.exit(0);
		}
		
		System.out.println("Resultado: " + resultado);
		
		if (resultado % 2 == 0) {
			parImpar = "Par";
		}else {
			parImpar = "Ímpar";
		}
		
		if (resultado > 0) {
			positivNegativ = "Positivo";
		}else if (resultado < 0) {
			positivNegativ = "Negativo";
		}else {
			positivNegativ = "Zero";
		}
		
		if (Math.ceil(resultado) != resultado) {
			intDecimal = "Decimal";
		}else {
			intDecimal = "Inteiro";
		}
		
		System.out.println("O número é " + parImpar + ", " + positivNegativ + " e " + intDecimal);
		
		
		System.out.println(resultado);
		
		entrada.close();
		
	}

}
