import java.util.Scanner;

public class at28 {

	public static void main(String[] args) {
		/*
		 Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
			"Telefonou para a vítima?"
			"Esteve no local do crime?"
			"Mora perto da vítima?"
			"Devia para a vítima?"
			"Já trabalhou com a vítima?"
			O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
			Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
			entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Responda com s - sim e n - não");
		System.out.print("Telefonou para a vítima? ");
		char p1 = entrada.next().charAt(0);
		System.out.print("Esteve no local do crime? ");
		char p2 = entrada.next().charAt(0);
		System.out.print("Mora perto da vítima? ");
		char p3 = entrada.next().charAt(0);
		System.out.print("Devia para a vítima? ");
		char p4 = entrada.next().charAt(0);
		System.out.print("Já trabalhou com a vítima? ");
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
			System.out.println("Cúmplice");
		else if (pontuacao == 5)
			System.out.println("Assassino");
		else
			System.out.println("Inocente");
		
		entrada.close();
		
	}

}
