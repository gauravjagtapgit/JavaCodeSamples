package practice_36;
import java.util.Scanner;

public class factorial_number {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter The Number");
		int no =s.nextInt();
		int factorial=1;
		for(int i=1;i<=no;i++) {
			
			factorial=factorial*i;
		}
		System.out.println("factor of "+no+" is "+factorial);
		

	}

}
