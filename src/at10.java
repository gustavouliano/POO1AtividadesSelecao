import java.util.Scanner;

public class at10 {

	public static void main(String[] args) {
		// Faça um Programa que leia três números e mostre o maior e o menor deles.

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Primeiro número: ");
		double n1 = entrada.nextDouble();
		System.out.print("Primeiro número: ");
		double n2 = entrada.nextDouble();
		System.out.print("Primeiro número: ");
		double n3 = entrada.nextDouble();
		
		double maior, menor;
		
		if ((n1 >= n2) && (n1 >= n3))
			maior = n1;
		else if ((n2 >= n1) && (n2 >= n3))
			maior = n2;
		else
			maior = n3;
		
		if ((n1 <= n2) && (n1 <= n3))
			menor = n1;
		else if ((n2 <= n1) && (n2 <= n3))
			menor = n2;
		else
			menor = n3;
		
		System.out.println("Maior: " + maior
				+ "\nMenor: " + menor);
		
		entrada.close();
		
	}

}
