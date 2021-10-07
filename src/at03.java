import java.util.Scanner;

public class at03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite [F/M]: ");
		char sexo = Character.toUpperCase(entrada.next().charAt(0));
		
		
		if (sexo == 'F')
			System.out.println("Feminino.");
		else if (sexo == 'M')
			System.out.println("Masculino");
		else
			System.out.println("Letra inválida");
		
		entrada.close();
		
	}

}
