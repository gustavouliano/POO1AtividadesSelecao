import java.util.Scanner;

public class at30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Até 5kg: "
				+ "\nMorango R$ 2,50 por kg"
				+ "\nMaçã    R$ 1,80 por kg"
				+ "\nAcima de 5kg: "
				+ "\nMorango R$ 2,20 por kg"
				+ "\nMaçã    R$ 1,50 por kg");
		System.out.print("Quantidade em kg de morangos: ");
		double morangoKg = entrada.nextDouble();
		System.out.print("Quantidade em kg de maçãs: ");
		double macaKg = entrada.nextDouble();
		
		double kgTotal = macaKg + morangoKg;
		double valorTotal = 0;
		
		if (morangoKg <= 5)
			valorTotal = valorTotal + (morangoKg * 2.50);
		else
			valorTotal = valorTotal + (morangoKg * 2.20);
		
		if (macaKg <= 5)
			valorTotal = valorTotal + (macaKg * 1.80);
		else
			valorTotal = valorTotal + (macaKg * 1.50);
		
		if ((kgTotal > 8) || valorTotal > 25)
			valorTotal = valorTotal - (valorTotal * 0.10);
		
		System.out.println("Valor a ser pago: R$ " + valorTotal);
		entrada.close();
		
		
	}

}
