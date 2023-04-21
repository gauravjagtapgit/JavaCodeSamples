package reeenew;
import java.util.Scanner;

public class ArmStrongPractice {
	
	 public static void main(String[]args){
		    Scanner w=new Scanner (System.in);
		    System.out.print("Enter number");
		 int no=w.nextInt();
		 int t1=no;
		 int leng=0;
		 while(t1 !=0){
		    leng=leng+1;
		    t1=t1/10;
		 }
		 int t2=no;
		 int arm=0;
		 int rem = 0;
		 while(t2 !=0){
		    int mul=1;
		    t2=t2%10;
		    for(int i=1;i<leng;i++){
		        mul=mul*rem;
		    }
		    arm=arm+mul;
		    t2=t2/10;
		 }
		 if(arm==no){
		    System.out.println(no+" number is armstrong");
		 }
		 else{
		    System.out.println(no+" number is not armstrong");
		 }
		    }
		}



