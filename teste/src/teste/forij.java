package teste;

public class forij {
	
    public static void main(String args[]){
    	int i,j = 0;
        for(i = 0; i < 3; i++){
        	for(j = 1; j < 3; j++){
        		if (i % j == 0) {
        			continue;
        		}else {System.out.println("i=" + i + ",j=" + j);}
        		
        	}
        }
        	
            
        }

}
