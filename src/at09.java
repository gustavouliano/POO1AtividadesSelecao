import java.util.Scanner;

public class at09 {

	public static void main(String[] args) {
		/*
		 Tendo como dado de entrada a altura, peso e sexo, construa um algoritmo que calcule
		 o peso ideal, utilizando as seguintes fórmulas:
			Para homens: (72.7*h) - 58
			Para mulheres: (62.1*h) - 44.7
			(h = altura)
			Ao final o algoritmo deve mostrar:
				- Altura, peso e sexo;
				- Peso Ideal;
				- Mensagem se está acima, abaixo ou no peso ideal;
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Altura (m): ");
		double altura = entrada.nextDouble();
		System.out.print("Peso: ");
		double peso = entrada.nextDouble();
		System.out.print("Sexo [M/F]: ");
		char sexo = Character.toUpperCase(entrada.next().charAt(0));
		
		double pesoIdeal;
		String sexoText;
		String pesoText;
		
		if ((sexo != 'M') && (sexo != 'F')) {
			System.out.println("Valor inválido");
		}
		else {
			if (sexo == 'M') {
				pesoIdeal = (72.7*altura) - 58;
				sexoText = "Masculino";
			}
			else {
				pesoIdeal = (62.1*altura) - 44.7;
				sexoText = "Feminino";
			}
		
			if (peso == pesoIdeal)
				pesoText = "Está no peso ideal.";
			else if (peso > pesoIdeal)
				pesoText = "Acima do peso ideal";
			else 
				pesoText = "Abaixo do peso ideal";
		
			System.out.println("\nAltura: " + altura
					+ "\nPeso: " + peso + "kg"
					+ "\nSexo: " + sexoText
					+ "\nPeso ideal: " + pesoIdeal + "kg"
					+ "\n" + pesoText);
		}
		
		entrada.close();
	
	}

}
