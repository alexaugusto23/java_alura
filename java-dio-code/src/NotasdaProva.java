import java.io.IOException;
import java.util.Scanner;

public class NotasdaProva {
	
    public static void main(String[] args) throws IOException {
        
        Scanner leitor = new Scanner(System.in);
        
        int nota = leitor.nextInt();
        if(nota == 0){System.out.println("E");}
        if(nota >= 1 && nota  <=35){System.out.println("D");}
        if(nota >=36 && nota  <=60){System.out.println("C");}
        if(nota >=61 && nota  <=85){System.out.println("B");}
        if(nota >=86 && nota  <=100){System.out.println("A");}
        leitor.close();
    }

}