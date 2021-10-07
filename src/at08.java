import java.util.Scanner;

public class at08 {

	public static void main(String[] args) {
		/*
		 Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve
		 calcular a média alcançada pelo aluno e apresentar:
			A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
			A mensagem "Reprovado", se a média for menor do que sete;
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		double n1 = entrada.nextDouble();
		System.out.print("Nota 2: ");
		double n2 = entrada.nextDouble();
		
		double media = (n1+n2)/2;
		System.out.println("Média: " + media);
		
		if (media >= 7)
			System.out.println("Aprovado.");
		else
			System.out.println("Reprovado.");
		
		entrada.close();
		
	}

}
