import java.util.Scanner;

public class CalculaIdade {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int idade = 23;

		System.out.println("Qual a sua idade:");
		idade = input.nextInt();

		System.out.println("Sua idade �: " + idade);

		if (idade >= 18) {
			System.out.println("Voc� � maior de idade, acesso permitido");
		}

		else {
			System.out.println("Voc� n�o tem acesso");
		}

		input.close();

	}

}