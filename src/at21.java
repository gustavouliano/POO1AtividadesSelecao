import java.util.Scanner;

public class at21 {

	public static void main(String[] args) {
		// Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dia: ");
		int dia = entrada.nextInt();
		
		if (dia < 1 || dia > 31) {
			System.out.println("Dia inválido");
			System.exit(0);
		}
		
		System.out.print("Mês: ");
		int mes = entrada.nextInt();
		
		if (mes < 1 || mes > 12) {
			System.out.println("Mês inválido");
			System.exit(0);
		}
		
		System.out.print("Ano: ");
		int ano = entrada.nextInt();
		
		if (ano < 0) {
			System.out.println("Ano inválido");
			System.exit(0);
		}
		
		System.out.println("Data é válida."
				+ "\n" + dia + "/" + mes + "/" + ano);
		
		
		entrada.close();
		
	}

}
