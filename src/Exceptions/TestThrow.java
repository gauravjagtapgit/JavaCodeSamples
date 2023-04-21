package Exceptions;
import java.util.Scanner;
public class TestThrow {

	//public static void validate(int age) {
		public static void main(String[] args) {
			
			 Scanner s =new Scanner(System.in);
		  	   System.out.println("Enter Your Age : ");
		  	   
		  	   int age=s.nextInt();
			
		
  	      try { 
  	        if(age<18) {
  		
  		     throw new ArithmeticException ("You are not eligible for voting");
  	     }
  	      else {
  		     System.out.println("You can vote successfully");
  	       }
  	    }
  	    catch(Exception e) {
  		    System.out.println(e); 	   
  	    }
     	  System.out.println("rest of the code");
	}
		
		
	//   public static void main(String[] args) {
		
    //	TestThrow.validate(15);
//		System.out.println("rest of the code");
	
	}


