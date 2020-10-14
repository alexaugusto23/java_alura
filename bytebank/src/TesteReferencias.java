public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("saldo segunda conta: " + segundaConta.saldo);
		segundaConta.saldo += 100;
		System.out.println("saldo segunda conta: " + segundaConta.saldo);
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		if (primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		}
		else {
			System.out.println("contas diferentes");	
		}
		System.out.println("primeira conta: " + primeiraConta);
		System.out.println("segunda conta: " + segundaConta);
	}

}
