
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("-- testando condicionais -- \n");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >=2 ;
		System.out.println("Valor de acompanhado: " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja Bem-vindo");
		} else {
			System.out.println("voc� n�o tem idade suficiente!!!");
		}
	}
}
