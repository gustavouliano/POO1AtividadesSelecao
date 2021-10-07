import java.util.Scanner;

public class at28 {

	public static void main(String[] args) {
		/*
		 Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas s�o:
			"Telefonou para a v�tima?"
			"Esteve no local do crime?"
			"Mora perto da v�tima?"
			"Devia para a v�tima?"
			"J� trabalhou com a v�tima?"
			O programa deve no final emitir uma classifica��o sobre a participa��o da pessoa no crime.
			Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "Suspeita",
			entre 3 e 4 como "C�mplice" e 5 como "Assassino". Caso contr�rio, ele ser� classificado como "Inocente".
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Responda com s - sim e n - n�o");
		System.out.print("Telefonou para a v�tima? ");
		char p1 = entrada.next().charAt(0);
		System.out.print("Esteve no local do crime? ");
		char p2 = entrada.next().charAt(0);
		System.out.print("Mora perto da v�tima? ");
		char p3 = entrada.next().charAt(0);
		System.out.print("Devia para a v�tima? ");
		char p4 = entrada.next().charAt(0);
		System.out.print("J� trabalhou com a v�tima? ");
		char p5 = entrada.next().charAt(0);
		
		int pontuacao = 0;
		
		if (Character.toLowerCase(p1) == 's')
			pontuacao = pontuacao + 1;
		if (Character.toLowerCase(p2) == 's')
			pontuacao = pontuacao + 1;
		if (Character.toLowerCase(p3) == 's')
			pontuacao = pontuacao + 1;
		if (Character.toLowerCase(p4) == 's')
			pontuacao = pontuacao + 1;
		if (Character.toLowerCase(p5) == 's')
			pontuacao = pontuacao + 1;
		
		if (pontuacao == 2)
			System.out.println("Suspeita");
		else if (pontuacao == 3 || pontuacao == 4)
			System.out.println("C�mplice");
		else if (pontuacao == 5)
			System.out.println("Assassino");
		else
			System.out.println("Inocente");
		
		entrada.close();
		
	}

}
