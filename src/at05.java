import java.util.Scanner;

public class at05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma letra: ");
		char letra = Character.toLowerCase(entrada.next().charAt(0));
		
		if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u'))
			System.out.println("É uma vogal");
		else
			System.out.println("Não é vogal");
		
		entrada.close();
		
	}

}
