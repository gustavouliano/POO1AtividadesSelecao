import java.util.Scanner;

public class at13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Valor por hora: R$ ");
		double valorHora = entrada.nextDouble();
		System.out.print("Horas trabalhadas no mês: ");
		double horasTrabalhadas = entrada.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		double ir;
		
		
		if (salarioBruto <= 900) {
			ir = 0;
		}else if (salarioBruto <= 1500) {
			ir = 5;
		}else if (salarioBruto <= 2500) {
			ir = 10;
		}else {
			ir = 20;
		}
		
		double irValor = (ir/100) * salarioBruto;
		double inss = salarioBruto * (double)10/100;
		double fgts = salarioBruto * (double)11/100;
		double totalDesconto = irValor + inss;
		double salarioLiquido = salarioBruto - totalDesconto;
		
		System.out.println("\nSalário Bruto: (" + valorHora + " * " + horasTrabalhadas + "):..R$ " + salarioBruto
						 + "\n(-) IR(" + ir + "%):..................R$ " + irValor
						 + "\n(-) INSS(10%):.................R$ " + inss
						 + "\nFGTS (11%):....................R$ " + fgts
						 + "\nTotal de descontos:............R$ " + totalDesconto
						 + "\nSalário Líquido:...............R$ " + salarioLiquido);
		
		entrada.close();
		
	}

}
