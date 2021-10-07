import java.util.Scanner;

public class at24 {

	public static void main(String[] args) {
		/*
		 Faça um Programa para leitura de três notas parciais de um aluno. O programa deve
		calcular a média alcançada por aluno e presentar:
			◦ A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
			◦ A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
			◦ A mensagem "Aprovado com Distinção", se a média for igual a 10.
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Nota 2: ");
		double nota2 = entrada.nextDouble();
		System.out.print("Nota 3: ");
		double nota3 = entrada.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if (media == 10)
			System.out.println("Aprovado com Distinção");
		else if (media >= 7)
			System.out.println("Aprovado");
		else
			System.out.println("Reprovado");
		
		System.out.println("Média: " + media);
		
		
		
		entrada.close();
		
	}

}
