import java.util.Scanner;
import java.lang.Math;

public class at19 {

	public static void main(String[] args) {
		/*
		 Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax² bx + c.
		  O programa deverá pe seguintes situações:
			Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o
		programa não deve fazer pedir os demais valores, sendo encerrado;
			Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e
		encerre o programa;
			Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
			Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Valor de a: ");
		double a = entrada.nextDouble();
		if (a == 0){
			System.out.println("Valor de a inválido, programa encerrado.");
			System.exit(0);
		}
		System.out.print("Valor de b: ");
		double b = entrada.nextDouble();
		System.out.print("Valor de c: ");
		double c = entrada.nextDouble();
		
		
		
		//Math.pow(base, potencia)
		double delta = ((Math.pow(b, 2)) - (4 * a * c));
		double x1 = (-b + (Math.sqrt(delta))) / (2 * a);
		double x2 = (-b - (Math.sqrt(delta))) / (2 * a);
		
		if (delta < 0) {
			System.out.println("Delta negativo, logo não possui raizes reais. Delta: " + delta);
			System.exit(0);
		}else if (delta == 0) {
			System.out.println("Delta zero, possui apenas uma raiz real."
					+ "\nx = " + x1);
		}else {
			System.out.println("Delta positivo, possui duas raízes reais."
					+ "\nx¹ = " + x1
					+ "\nx² = " + x2);
		}
		
		entrada.close();
		
	}

}
