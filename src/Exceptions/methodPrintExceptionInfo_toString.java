package Exceptions;

public class methodPrintExceptionInfo_toString {

	public static void main(String[] args) {
		
		//Method 2)printStackTrace --->get I)Exception name , II) Description 
		
		 try {
			 int a =100/0;
			 
			 System.out.println(a);
			 
			 System.out.println("check flow 1");
		 }
		  catch(ArithmeticException e) {
			  
			 
			  System.out.println(e);
			  
			  System.out.println("check flow 2");
			  
			  System.out.println(e.toString());  //------method 2
			  
			  System.out.println("check flow 3");
		  }
		  System.out.println("check flow 4");

	}

}
