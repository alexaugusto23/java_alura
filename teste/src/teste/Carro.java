package teste;

public class Carro {
	public static void main(String[] a) {
		new Carro().anda();
	}
	
	public static void anda() {
		System.out.println("andando...");
		para() ;
	}
	
	public static void para() {
		System.out.println("parando...");
	}


}
