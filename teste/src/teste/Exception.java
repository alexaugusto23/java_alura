package teste;

public class Exception {
	
	class NormalException extends Exception {}
	class EspecialException extends RuntimeException {}
	public class G {
		public void metodo() throws NormalException{
			throws new NormalException();
		}
		public static void main(String[] args[]) {
			int a, b, c, d;
			a=b=c=d=0;
			try {
				newG ().metodo();
				a++;
				
			}catch (NormalException e){
				b++;
			}catch (EspecialException e){
				c++;
			}finally {
				d++;
			}
		}
	}
	

}
