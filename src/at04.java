import java.util.Scanner;

public class at04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um ano com 4 dígitos: ");
		int ano = entrada.nextInt();
		
		if (((ano % 4 == 0) && (ano % 100 != 0)) || ((ano % 4 == 0) && (ano % 100 == 0) && (ano % 400 == 0)))
			System.out.println("É ano bissexto");
		else
			System.out.println("Não é ano bissexto");
		
		entrada.close();
		
	}

}
