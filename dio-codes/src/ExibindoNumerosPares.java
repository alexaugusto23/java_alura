import java.io.IOException;
import java.util.Scanner;

public class ExibindoNumerosPares
{
	
    public static void main(String[] args) throws IOException 
    {
        
        Scanner leitor = new Scanner(System.in);
        int input = leitor.nextInt();
        
        for (int i = 1 ; i <= input ; i++) 
      	{
      		if (i % 2 == 0) System.out.println(i);
          }
        leitor.close();
    }

}