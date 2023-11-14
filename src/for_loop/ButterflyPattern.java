package for_loop;

public class ButterflyPattern {
	
	    public static void main(String[] args) {
	        for(int i=1; i<=5;i++){
	            for(int j=1; j<=i;j++){
	                System.out.print("*");
	            }
	            for(int k=4; k>=i;k--){
	                System.out.print("  ");
	            }
	           
	          for(int z=1; z<=i; z++){
	            System.out.print("*");
	          }
	          System.out.println();
	        }
	        //  //revers
	         for(int q=1; q<=4;q++){
	            for(int a=4; a>=q;a--){
	                System.out.print("*");
	            }
	            for(int b=1; b<=q;b++){
	                System.out.print("  ");
	            }
	            
	            for(int c=4; c>=q;c--){
	                System.out.print("*");
	            }
	          System.out.println();
	        }
	    }
	}


