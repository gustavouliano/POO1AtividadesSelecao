import java.util.Scanner;

public class at22 {

	public static void main(String[] args) {
		// Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade
		// de centenas, dezenas e unidades do mesmo.

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro menor que 1000: ");
		int num = entrada.nextInt();
		
		int unidade = num%10; // pega a unidade somente
		int dezena = ((num%100) - unidade)/10; // pega a dezena+unidade, entao subtraio a unidade e divido por 10
		int centena = ((num%1000) - (unidade + dezena))/100;
		
		System.out.println(centena + " centena(s), " +  dezena + " dezena(s) e " +  unidade + " unidade(s).");
		
		
		
		entrada.close();
		
	}

}
