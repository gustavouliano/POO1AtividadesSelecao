import java.util.Scanner;

public class at29 {

	public static void main(String[] args) {
		/*
		 Um posto está vendendo combustíveis com a seguinte tabela de descontos: 
		 Álcool: até 20 litros, desconto de 3% por litro acima de 20 litros, desconto de 5% por litro
		 Gasolina: até 20 litros, desconto de 4% por litro acima de 20 litros, desconto de 6% por litro
		Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: 
			A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente 
		sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Número de litros vendidos: ");
		double litro = entrada.nextDouble();
		System.out.println("Tipo de combustível:"
				+ "\nA - Álcool"
				+ "\nG - Gasolina");
		char combustivel = entrada.next().charAt(0);
		
		double alcool = 1.90;
		double gasolina = 2.50;
		double precoFinal = 0;
		
		if (Character.toUpperCase(combustivel) == 'A') {
			if (litro <= 20)
				alcool = alcool - (alcool * 0.3);
			else
				alcool = alcool - (alcool * 0.5);
			
			precoFinal = litro * alcool;
		
		}else if (Character.toUpperCase(combustivel) == 'G') {
			if (litro <= 20)
				gasolina = gasolina - (gasolina * 0.4);
			else
				gasolina = gasolina - (gasolina * 0.6);
			
			precoFinal = litro * gasolina;
		}
			
		System.out.println("Preço final: R$ " + precoFinal);
		entrada.close();
		
	}

}
