import java.util.Scanner;

public class at23 {

	public static void main(String[] args) {
		
		/*
		Faça um Programa para ler três idades de alunos e seguir as seguintes instruções:
			◦ Se a média de idade dos alunos é inferior de 25, apresentar a mensagem "Turma Jovem";
			◦ Se a média de idade dos alunos é entre 25 e 40, apresentar a mensagem "Turma Adulta";
			◦ Se a média de idade dos alunos é acima de 40 anos, apresentar a mensagem "Turma Idosa".
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Idade do 1° aluno: ");
		int idade1 = entrada.nextInt();
		System.out.print("Idade do 2° aluno: ");
		int idade2 = entrada.nextInt();
		System.out.print("Idade do 3° aluno: ");
		int idade3 = entrada.nextInt();

		double mediaIdade = (idade1 + idade2 + idade3)/3;
		
		System.out.println("A média de idade dos alunos é: " + mediaIdade);
		
		if (mediaIdade < 25)
			System.out.println("Turma Jovem");
		else if (mediaIdade < 40)
			System.out.println("Turma Adulta");
		else
			System.out.println("Turma idosa");
		
		entrada.close();
		
	}

}
