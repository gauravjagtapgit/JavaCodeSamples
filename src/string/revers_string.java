package string;

public class revers_string {
	public static void main(String[] args) {
//	revers String--1)use (for loop & lenght & charAt() mehod)	2)using StringBuilder class
//	1)using for loop
	String g="gaurav";
	String revers="";
	System.out.println("revers string lenght:- "+g.length());
	
	for(int i=g.length()-1;i>=0;i--) {
		revers=revers+g.charAt(i);
	}
       System.out.println("revers string is: "+revers);//for one time writ outside the for loop body
//       1st method practice
       String g2="JAGTAP";
       String rev="";
       for(int i=5;i>=0;i--) {
    	   rev=rev+g2.charAt(i);
//    	   System.out.println(revers);
       }
       System.out.println("again revers strin:- "+rev);

//       2)using StringBuilder class
       StringBuilder g3=new StringBuilder(g);
       g3.reverse();
       System.out.println("StrinBuilder class through revers:- "+g3);
}
}

	