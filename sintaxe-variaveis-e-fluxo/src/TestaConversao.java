
public class TestaConversao {
	public static void main (String[] args) {
		
		double salario = 1270.50;
		int valor = (int) salario; // casting (int)
		//double valor = 3;
		System.out.println(valor);
		
		// int ate 32 bits 200000
		//long numeroGrande = 23655156161654146L;
		//short valorPequeno = 2131;
		//byte b = 127;
		//float pontoFlutante = 3.14f;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1+valor2;
		System.out.println(total);
		
	}
	
	/*
	TIPO	TAMANHO
	boolean	1 bit
	byte	1 byte
	short	2 bytes
	char	2 bytes
	int	    4 bytes
	float	4 bytes
	long	8 bytes
	double	8 bytes
	*/

}
