import java.util.Scanner;

public class at06 {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a um n�mero inteiro e se este n�mero for par, transforme-o em impar e vice-versa.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		int num = entrada.nextInt();
		
		num = num + 1;  // j� transformo o num aqui
		
		if (num % 2 == 0) {
			System.out.println("Virou par: " + num);
		}
		else {
			System.out.println("Virou �mpar: " + num);
		}		
		
		entrada.close();
		
	}

}
