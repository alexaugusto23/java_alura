public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.agencia = 0001;
		primeiraConta.numero = 00001;
		primeiraConta.titular = "Alex";
		System.out.println("Endere�o de m�moria: " + primeiraConta);
		System.out.println("Titular: " + primeiraConta.titular);
		System.out.println("Ag�ncia: " + primeiraConta.agencia);
		System.out.println("Numero: " + primeiraConta.numero);
		System.out.println("Saldo: " + primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println("Saldo: " + primeiraConta.saldo);
		System.out.println("\n");
		Conta segundaConta = new Conta();
		segundaConta.saldo = 25400;
		segundaConta.agencia = 0002;
		segundaConta.numero = 00002;
		segundaConta.titular = "Adriano";
		System.out.println("Endere�o de m�moria: " + segundaConta);
		System.out.println("Titular: " + segundaConta.titular);
		System.out.println("Ag�ncia: " + segundaConta.agencia);
		System.out.println("Numero: " + segundaConta.numero);
		System.out.println("Saldo: " + segundaConta.saldo);
		if (primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		}
		else {
			System.out.println("contas diferentes");	
		}
		System.out.println("primeira conta: " + primeiraConta);
		System.out.println("segunda conta : " + segundaConta);
	}

}
