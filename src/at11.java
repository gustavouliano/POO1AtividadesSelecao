import java.util.Scanner;

public class at11 {

	public static void main(String[] args) {
		/*
		 Fa�a um Programa que pergunte em que turno voc� estuda. 
		 Pe�a para digitar M-Matutino ou V-Vespertino ou N- Noturno. 
		 Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!", conforme o caso.
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual turno voc� estuda? "
				+ "\n M - Matutino"
				+ "\n V - Vespertino"
				+ "\n N - Noturno"
				+ "\nResposta: ");
		char turno = Character.toUpperCase(entrada.next().charAt(0));
		
		if (turno == 'M')
			System.out.println("Bom dia!");
		else if (turno == 'V')
			System.out.println("Boa tarde!");
		else if (turno == 'N')
			System.out.println("Boa noite!");
		else
			System.out.println("Valor inv�lido.");
		
		entrada.close();
		
	}

}
