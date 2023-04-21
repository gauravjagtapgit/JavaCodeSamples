package Exceptions;

public class methodPrintExceptionInfo_getMessage {

	public static void main(String[] args) {


		//Method 3)printStackTrace --->get only I) Description 
		
		 try {
			 int a =100/0;
			 
			 System.out.println("ArithmeticException"); //not execut becous when exception occuer on line he direct going in catch block:)
			 
			 System.out.println(a);
			 
			 System.out.println("check flow 1");
		 }
		  catch(ArithmeticException e) {
			  
			 
			  System.out.println(e);
			  
			  System.out.println("check flow 2");
			  
			  System.out.println(e.getMessage());  //------method 2
			  
			  System.out.println("check flow 3");
			  
			  System.out.println("ArithmeticException"); //------> prosthetic way to print exception
			  
			  System.out.println("NoSuchElementException");
		  }
		  System.out.println("check flow 4");

	}

}
