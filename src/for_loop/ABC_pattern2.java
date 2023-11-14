package for_loop;

public class ABC_pattern2 {

	public static void main(String[] args) {
		 for(char i=1;i<=5;i++){
	            for(char j=1;j<=i;j++){
	                System.out.print(i+" ");
	            }
	            System.out.println();
	        }
	        for(int i=1;i<=5;i++){
	            for(int j=1;j<=i;j++){
	                System.out.print((char)(96+i)+" ");
	            }
	            System.out.println();
	        }
	    }
	}

