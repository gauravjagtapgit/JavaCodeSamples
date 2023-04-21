package Exceptions;

public class tryCatch_block {
	public static void main(String[] args) {
		
	 System.out.println("befor try block");
	 try {
		 
		 int a=100,b=20,c;
		 c=a/b;
		 System.out.println(c);
		 System.out.println("check try execut or not");
		 
	 }
	 catch(Exception e) {
		 System.out.println("check catch exeut or not");
		 System.out.println(e);
		 System.out.println("after catch block");
	 }
//	 finally {
//		 System.out.println("Execute finally block");
//	 }
		
	}

}
