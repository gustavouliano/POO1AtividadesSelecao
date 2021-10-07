import java.util.Scanner;

public class at15 {

	public static void main(String[] args) {
		/*
		 Fa�a um Programa que tendo como dados de entrada o pre�o de custo de um produto e
		 um c�digo de origem, emita o pre�o junto de sua proced�ncia. Caso o c�digo n�o seja
		 nenhum dos especificados, o produto deve ser classificado como importado. C�digo de
		 origem: 1 - Sul, 2 - Norte 3 - Leste, 4 - Oeste, 5 ou 6 - nordeste 7 ou 8 Centro-oeste.
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Pre�o do produto: ");
		double preco = entrada.nextDouble();
		System.out.print("C�digo de origem: ");
		int codigo = entrada.nextInt();
		
		String origem;
		
		if (codigo == 1)
			origem = "Sul";
		else if (codigo == 2)
			origem = "Norte";
		else if (codigo == 3)
			origem = "Leste";
		else if (codigo == 4)
			origem = "Oeste";
		else if (codigo == 5 || codigo == 6)
			origem = "Nordeste";
		else if (codigo == 7 || codigo == 8)
			origem = "Centro-Oeste";
		else
			origem = "Importado";
		
		System.out.println("Pre�o: R$ " + preco
				+ "\nProced�ncia: " + origem);
		
		
		
		entrada.close();
		
	}

}
