import java.util.Scanner;

public class at18 {

	public static void main(String[] args) {
		/*
		 Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa dever� informar se
		os valores podem ser um tri�ngulo. Indique, caso os lados formem um tri�ngulo, se o mesmo
		�: equil�tero, is�sceles ou escaleno.
		Dicas:
			Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que o terceiro;
			Tri�ngulo Equil�tero: tr�s lados iguais;
			Tri�ngulo Is�sceles: quaisquer dois lados iguais;
			Tri�ngulo Escaleno: tr�s lados diferentes;
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Lado 1: ");
		double lado1 = entrada.nextDouble();
		System.out.print("Lado 2: ");
		double lado2 = entrada.nextDouble();
		System.out.print("Lado 3: ");
		double lado3 = entrada.nextDouble();
		
		if (((lado1 + lado2) > lado3) && ((lado2 + lado3) > lado1) && ((lado1 + lado3) > lado2)) {
			System.out.println("Pode ser um tri�ngulo");
			if ((lado1 == lado2) && (lado1 == lado3)) {
				System.out.println("Tri�ngulo Equil�tero");
			}
			else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
				System.out.println("Tri�ngulo Is�sceles");
			}
			else {
				System.out.println("Tri�ngulo Escaleno");
			}
		}
		else {
			System.out.println("N�o pode ser um tri�ngulo");
		}
		
		
		entrada.close();
		
	}

}
