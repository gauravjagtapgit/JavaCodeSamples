package Exceptions;

public class finallyBlock {

	public static void main(String[] args) {
		
		// When Exception occurs & is handled by the catch block
		
		try {
			
			System.out.println("Inside try block");
			
			int data = 25/0;
			
			System.out.println(data);
		}
		catch ( ArithmeticException e) {
			
			System.out.println("Exception handles");
			
			System.out.println(e);
		}
		//executes regardless of exception occured or not
		
		finally {
			
			System.out.println("finally block is always executed");
		}
		
		System.out.println("rest of the code");

	}

}
 