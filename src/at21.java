import java.util.Scanner;

public class at21 {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a uma data no formato dd/mm/aaaa e determine se a mesma � uma data v�lida.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dia: ");
		int dia = entrada.nextInt();
		
		if (dia < 1 || dia > 31) {
			System.out.println("Dia inv�lido");
			System.exit(0);
		}
		
		System.out.print("M�s: ");
		int mes = entrada.nextInt();
		
		if (mes < 1 || mes > 12) {
			System.out.println("M�s inv�lido");
			System.exit(0);
		}
		
		System.out.print("Ano: ");
		int ano = entrada.nextInt();
		
		if (ano < 0) {
			System.out.println("Ano inv�lido");
			System.exit(0);
		}
		
		System.out.println("Data � v�lida."
				+ "\n" + dia + "/" + mes + "/" + ano);
		
		
		entrada.close();
		
	}

}
