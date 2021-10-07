import java.util.Scanner;

public class at18 {

	public static void main(String[] args) {
		/*
		 Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se
		os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo
		é: equilátero, isósceles ou escaleno.
		Dicas:
			Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
			Triângulo Equilátero: três lados iguais;
			Triângulo Isósceles: quaisquer dois lados iguais;
			Triângulo Escaleno: três lados diferentes;
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Lado 1: ");
		double lado1 = entrada.nextDouble();
		System.out.print("Lado 2: ");
		double lado2 = entrada.nextDouble();
		System.out.print("Lado 3: ");
		double lado3 = entrada.nextDouble();
		
		if (((lado1 + lado2) > lado3) && ((lado2 + lado3) > lado1) && ((lado1 + lado3) > lado2)) {
			System.out.println("Pode ser um triângulo");
			if ((lado1 == lado2) && (lado1 == lado3)) {
				System.out.println("Triângulo Equilátero");
			}
			else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
				System.out.println("Triângulo Isósceles");
			}
			else {
				System.out.println("Triângulo Escaleno");
			}
		}
		else {
			System.out.println("Não pode ser um triângulo");
		}
		
		
		entrada.close();
		
	}

}
