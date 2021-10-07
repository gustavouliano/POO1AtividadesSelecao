import java.util.Scanner;

public class at08 {

	public static void main(String[] args) {
		/*
		 Fa�a um programa para a leitura de duas notas parciais de um aluno. O programa deve
		 calcular a m�dia alcan�ada pelo aluno e apresentar:
			A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
			A mensagem "Reprovado", se a m�dia for menor do que sete;
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		double n1 = entrada.nextDouble();
		System.out.print("Nota 2: ");
		double n2 = entrada.nextDouble();
		
		double media = (n1+n2)/2;
		System.out.println("M�dia: " + media);
		
		if (media >= 7)
			System.out.println("Aprovado.");
		else
			System.out.println("Reprovado.");
		
		entrada.close();
		
	}

}
