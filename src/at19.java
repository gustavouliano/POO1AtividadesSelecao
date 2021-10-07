import java.util.Scanner;
import java.lang.Math;

public class at19 {

	public static void main(String[] args) {
		/*
		 Fa�a um programa que calcule as ra�zes de uma equa��o do segundo grau, na forma ax� bx + c.
		  O programa dever� pe seguintes situa��es:
			Se o usu�rio informar o valor de A igual a zero, a equa��o n�o � do segundo grau e o
		programa n�o deve fazer pedir os demais valores, sendo encerrado;
			Se o delta calculado for negativo, a equa��o n�o possui raizes reais. Informe ao usu�rio e
		encerre o programa;
			Se o delta calculado for igual a zero a equa��o possui apenas uma raiz real; informe-a ao usu�rio;
			Se o delta for positivo, a equa��o possui duas raiz reais; informe-as ao usu�rio;
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Valor de a: ");
		double a = entrada.nextDouble();
		if (a == 0){
			System.out.println("Valor de a inv�lido, programa encerrado.");
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
			System.out.println("Delta negativo, logo n�o possui raizes reais. Delta: " + delta);
			System.exit(0);
		}else if (delta == 0) {
			System.out.println("Delta zero, possui apenas uma raiz real."
					+ "\nx = " + x1);
		}else {
			System.out.println("Delta positivo, possui duas ra�zes reais."
					+ "\nx� = " + x1
					+ "\nx� = " + x2);
		}
		
		entrada.close();
		
	}

}
