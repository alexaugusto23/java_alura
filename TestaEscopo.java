
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("-- testando condicionais -- \n");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado;
		
		//boolean acompanhado = quantidadePessoas >=2 ;
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {acompanhado = false;
			
		}
		
		
		System.out.println("Valor de acompanhado: " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja Bem-vindo");
		} else {
			System.out.println("você não tem idade suficiente!!!");
		}
	}
}