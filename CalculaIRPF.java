import java.util.Scanner;
public class CalculaIRPF {
	
	public static void main (String[]args) {
	Scanner input = new Scanner(System.in);
	double salario = 0;
	double percentual_ir_sete_e_meio = 7.5/100;
	double percentual_ir_quinze = 15/100;
	double percentual_ir_vintedois_e_meio = 22.5/100;
	double percentual_ir_vintesete_e_meio = 27.5/100;
	double deducao = 0;
	
	
	System.out.println("Digite o seu sal�rio:");
	salario = input.nextInt();
	
	
	if (salario >= 1903.98 && salario <= 2826.65) {
		deducao = salario * percentual_ir_sete_e_meio;
		System.out.println("O IR � de 7.5% e pode deduzir na declara��o o valor de R$ " + deducao);}
	else if (salario > 2826.65 && salario <= 3751.05) {
		deducao = deducao + salario * percentual_ir_quinze;
		System.out.println("O IR � de 15% e pode deduzir R$ " + deducao);}
	else if (salario > 3751.05 && salario <= 4664.68) {
		deducao = salario * percentual_ir_vintedois_e_meio;
		System.out.println("O IR � de 22.5% e pode deduzir R$ " + deducao);}
	else if (salario > 4664.68) {
		deducao = salario * percentual_ir_vintesete_e_meio;
		System.out.println("O IR � de 27.5% e pode deduzir R$ " + deducao);}
	else {System.out.println("Voc� � isento!!!");}
	
	input.close();

	}
}
