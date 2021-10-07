import java.util.Scanner;

public class at15 {

	public static void main(String[] args) {
		/*
		 Faça um Programa que tendo como dados de entrada o preço de custo de um produto e
		 um código de origem, emita o preço junto de sua procedência. Caso o código não seja
		 nenhum dos especificados, o produto deve ser classificado como importado. Código de
		 origem: 1 - Sul, 2 - Norte 3 - Leste, 4 - Oeste, 5 ou 6 - nordeste 7 ou 8 Centro-oeste.
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Preço do produto: ");
		double preco = entrada.nextDouble();
		System.out.print("Código de origem: ");
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
		
		System.out.println("Preço: R$ " + preco
				+ "\nProcedência: " + origem);
		
		
		
		entrada.close();
		
	}

}
