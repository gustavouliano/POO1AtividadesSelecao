import java.util.Scanner;

public class at16 {

	public static void main(String[] args) {
		// Altere o programa que calcula a média do aluno, e mostre a mensagem de acordo com a média. 
		// De 0 a 3 - Reprovado, de 3 a 6.9 - Em Exame, de 7 a 10 - Aprovado

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		double n1 = entrada.nextDouble();
		System.out.print("Nota 2: ");
		double n2 = entrada.nextDouble();
		
		double media = (n1+n2)/2;
		System.out.println("Média: " + media);
		
		if (media < 3)
			System.out.println("Reprovado");
		else if (media < 7)
			System.out.println("Em exame");
		else
			System.out.println("Aprovado");
		
		entrada.close();
		
	}

}
