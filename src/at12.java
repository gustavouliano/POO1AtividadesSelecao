import java.util.Scanner;

public class at12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Salário: R$ ");
		double salario = entrada.nextDouble();
		
		double porcentual;
		
		if (salario <= 280)
			porcentual = 20;
		else if (salario <= 700)
			porcentual = 15;
		else if (salario <= 1500)
			porcentual = 10;
		else
			porcentual = 5;
		
		double aumentoSalario = salario * (porcentual/100);
		double novoSalario = salario + aumentoSalario;
		
		System.out.println("\nSalário antes do reajuste: R$ " + salario
				+ "\nPercentual de aumento aplicado: " + porcentual + "%"
				+ "\nValor do aumento: R$ " + aumentoSalario
				+ "\nNovo salário: R$ " + novoSalario);
		
		entrada.close();
		
	}

}
