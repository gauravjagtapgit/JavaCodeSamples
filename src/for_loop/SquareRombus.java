package for_loop;

public class SquareRombus {
	 public static void main(String[] args) {
	        int n=5;
	        for(int row=1;row<=n;row++){
	            // for(int spa=1;spa<=row;spa++){ //down side
	                for(int spa=1;spa<=n-row;spa++){//up side
	                System.out.print(" ");
	            }
	               for(int col=1;col<=5;col++){
	           System.out.print("*");
	          }
	          System.out.println();
	        }
	        
	        }

}
