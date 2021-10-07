import java.util.Scanner;

public class at31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Até 5kg: "
				+ "\nFilé Duplo R$ 4,90 por kg"
				+ "\nAlcatra    R$ 5,90 por kg"
				+ "\nPicanha    R$ 6,90 por kg"
				+ "\nAcima de 5kg: "
				+ "\nFilé Duplo R$ 5,80 por kg"
				+ "\nAlcatra    R$ 6,80 por kg"
				+ "\nPicanha    R$ 7,80 por kg");
		
		System.out.println("[1] - Filé Duplo"
				+ "\n[2] - Alcatra"
				+ "\n[3] - Picanha");
		System.out.print("Tipo de carne: ");
		int tipoCarne = entrada.nextInt();
		System.out.print("Quantidade de carne (kg): ");
		double qntd_carne = entrada.nextDouble();
		System.out.print("Cartão Tabajara [S/N]: ");
		char cartao = entrada.next().charAt(0);
		
		double valorTotal = 0;
		String carne = "";
		double desconto = 0;
		
		if (tipoCarne == 1) {
			if (qntd_carne <= 5)
				valorTotal = 4.90 * qntd_carne;
			else
				valorTotal = 5.80 * qntd_carne;
			
			carne = "Filé Duplo";
			
		}else if (tipoCarne == 2) {
			if (qntd_carne <= 5)
				valorTotal = 5.90 * qntd_carne;
			else
				valorTotal = 6.80 * qntd_carne;
			
			carne = "Alcatra";
			
		}else if (tipoCarne == 3) {
			if (qntd_carne <= 5)
				valorTotal = 6.90 * qntd_carne;
			else
				valorTotal = 7.80 * qntd_carne;
			carne = "Picanha";
		}else {
			System.out.println("Valor inválido");
			System.exit(0);
		}

		
		System.out.println("Tipo de carne: " + carne
				+ "\nQuantidade de carne: " + qntd_carne + " kg"
						+ "\nPreço: R$ " + valorTotal);
		if (Character.toUpperCase(cartao) == 'S') {
			desconto = (valorTotal * 0.05);
			valorTotal = valorTotal - desconto;
			System.out.println("Com cartão, desconto de R$ " + desconto
					+ "\nTotal a pagar: R$ " + valorTotal);
		}
		entrada.close();
		
	}

}
