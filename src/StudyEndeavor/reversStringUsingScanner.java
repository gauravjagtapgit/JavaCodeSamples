package StudyEndeavor;

import java.util.Scanner;

public class reversStringUsingScanner {

	public static void main(String[] args) {
		Scanner name=new Scanner(System.in);
		
		System.out.println("Enter String");
	
		String str=name.next();
		
		String rev=" ";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
