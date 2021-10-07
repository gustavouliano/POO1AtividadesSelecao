import java.util.Scanner;

public class at32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("[a] ou [b]");
		System.out.print("Questão 1: ");
		char q1 = entrada.next().charAt(0);
		System.out.print("Questão 2: ");
		char q2 = entrada.next().charAt(0);
		System.out.print("Questão 3: ");
		char q3 = entrada.next().charAt(0);
		System.out.print("Questão 4: ");
		char q4 = entrada.next().charAt(0);
		System.out.print("Questão 5: ");
		char q5 = entrada.next().charAt(0);
		System.out.print("Questão 6: ");
		char q6 = entrada.next().charAt(0);
		System.out.print("Questão 7: ");
		char q7 = entrada.next().charAt(0);
		System.out.print("Questão 8: ");
		char q8 = entrada.next().charAt(0);
		System.out.print("Questão 9: ");
		char q9 = entrada.next().charAt(0);
		System.out.print("Questão 10: ");
		char q10 = entrada.next().charAt(0);
		
		int pontuacao = 0;
		
		if (Character.toLowerCase(q1) == 'a') {
			System.out.println("Q1: " + q1 + " : Correto");
			pontuacao++;
		}
		else { 
			System.out.println("Q1: " + q1 + " : Errada, resposta correta (a)");
		}
		if (Character.toLowerCase(q2) == 'a') {
			System.out.println("Q2: " + q2 + " : Correto");
			pontuacao++;
		}
		else { 
			System.out.println("Q2: " + q2 + " : Errada, resposta correta (a)");
		}
		if (Character.toLowerCase(q3) == 'b') {
			System.out.println("Q3: " + q3 + " : Correto");
			pontuacao++;
		}
		else { 
			System.out.println("Q3: " + q3 + " : Errada, resposta correta (b)");
		}
		if (Character.toLowerCase(q4) == 'b') {
			System.out.println("Q4: " + q4 + " : Correto");
			pontuacao++;
		}
		else { 
			System.out.println("Q4: " + q4 + " : Errada, resposta correta (b)");
		}
		if (Character.toLowerCase(q5) == 'c') {
			System.out.println("Q5: " + q5 + " : Correto");
			pontuacao++;
		}
		else { 
			System.out.println("Q5: " + q5 + " : Errada, resposta correta (c)");
		}
		if (Character.toLowerCase(q6) == 'c') {
			System.out.println("Q6: " + q6 + " : Correto");
			pontuacao++;
		}
		else { 
			System.out.println("Q6: " + q6 + " : Errada, resposta correta (c)");
		}
		if (Character.toLowerCase(q7) == 'd') {
			System.out.println("Q7: " + q7 + " : Correto");
			pontuacao++;
		}
		else { 
			System.out.println("Q7: " + q7 + " : Errada, resposta correta (d)");
		}
		if (Character.toLowerCase(q8) == 'd') {
			System.out.println("Q8: " + q8 + " : Correto");
			pontuacao++;
		}
		else { 
			System.out.println("Q8: " + q8 + " : Errada, resposta correta (d)");
		}
		if (Character.toLowerCase(q9) == 'e') {
			System.out.println("Q9: " + q9 + " : Correto");
			pontuacao++;
		}
		else { 
			System.out.println("Q9: " + q9 + " : Errada, resposta correta (e)");
		}
		if (Character.toLowerCase(q10) == 'e') {
			System.out.println("Q10: " + q10 + " : Correto");
			pontuacao++;
		}
		else { 
			System.out.println("Q10: " + q10 + " : Errada, resposta correta (e)");
		}
		
		System.out.println("Pontuação Final: " + pontuacao);
		
		entrada.close();
		
	}

}
