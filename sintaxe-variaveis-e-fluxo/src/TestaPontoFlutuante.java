import java.text.DecimalFormat; 

public class TestaPontoFlutuante {
	public static void main(String[] args) {
		double salario;
		salario = 1250.70454;
			
		System.out.println("meu sal�rio � " + salario);
		System.out.printf("format na string: %.2f \n", salario);
		System.out.println("Usando DecimalFormat " + new DecimalFormat(".##").format(salario));
				
		//double idade = 37;
		
		double divisao = 3.14 / 2;
		System.out.println("Divis�o:" + divisao);
		
		int outraDivisao = 5 / 2;
		System.out.println("Outra divis�o: " + outraDivisao);
		
		double novaTentativa = 5.0 / 2;
		System.out.println("Nova tentativa: " + novaTentativa);
		
	}

}
