import java.util.Scanner;

public class at25 {

	public static void main(String[] args) {
		/*
		 Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a
		valor do saque e depois informar quantas notas de cada valor serão fornecidas. As notas
		disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de
		600 reais. O programa não deve se preocupar com a quantidade de notas existentes na
		máquina.
			Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma
			nota de 50, uma nota de 5 e uma nota de 1;
			Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma
			nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Valor do saque: R$ ");
		double valor = entrada.nextDouble();
		
		int notaCem = (int)valor/100;
		if (notaCem > 0) {
			System.out.println(notaCem + " nota(s) de R$ 100");
			valor = valor - (notaCem * 100);
		}
		
		int notaCinquenta = (int)valor/50;		
		if (notaCinquenta > 0) {
			System.out.println(notaCinquenta + " nota(s) de R$ 50");
			valor = valor - (notaCinquenta * 50);
		}
		
		int notaDez = (int)valor/10;
		if (notaDez > 0) {
			System.out.println(notaDez + " nota(s) de R$ 10");
			valor = valor - (notaDez * 10);
		}
		
		int notaCinco = (int)valor/5;
		if (notaCinco > 0) {
			System.out.println(notaCinco + " nota(s) de R$ 5");
			valor = valor - (notaCinco * 5);
		}
		
		int notaUm = (int)valor;
		if (notaUm > 0) {
			System.out.println(notaUm + " nota(s) de R$ 1");
		}
		
		entrada.close();
		
	}

}
