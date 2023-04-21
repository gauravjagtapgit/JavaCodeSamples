package Exceptions;

public class methodPrintExceptionInfo_printStackTrace {

	public static void main(String[] args) {
		
		//Method 1)printStackTrace --->get I)Exception name , II) Description , III) Stack trace
		
	 try {
		 int a =100/0;
		 
		 System.out.println(a);
		 
		 System.out.println("check flow 1");
	 }
	  catch(ArithmeticException e) {
		  
		 
		  System.out.println(e);
		  
		  System.out.println("check flow 2");
		  
		  e.printStackTrace();
		  
		  System.out.println("check flow 3");
	  }
	  System.out.println("check flow 4");

	}

}
