import java.util.Scanner;

public class at17 {

	public static void main(String[] args) {
		/*
		 Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao
		longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
		Média de Aproveitamento Conceito
			Entre 9.0 e 10.0 A
			Entre 7.5 e 9.0 B
			Entre 6.0 e 7.5 C
			Entre 4.0 e 6.0 D
			Entre 4.0 e zero E
		O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e
		a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		double n1 = entrada.nextDouble();
		System.out.print("Nota 2: ");
		double n2 = entrada.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		char conceito;
		String aprovacao;
		
		
		if ((media >= 0) && (media < 4)) {
			conceito = 'E';
			aprovacao = "Reprovado";
		}else if (media < 6) {
			conceito = 'D';
			aprovacao = "Reprovado";
		}else if (media < 7.5) {
			conceito = 'C';
			aprovacao = "Aprovado";
		}else if (media < 9) {
			conceito = 'B';
			aprovacao = "Aprovado";
		}else {
			conceito = 'A';
			aprovacao = "Aprovado";
		}
		
		System.out.println("Notas: " + n1 + " e " + n2
				+ "\nMédia: " + media
				+ "\nConceito: " + conceito
				+ "\n" + aprovacao);
		
		
		
		entrada.close();
		
		
	}

}
