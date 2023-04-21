package reeenew;
import java.util.Scanner;
public class ExampleArmstrong {
	   private static Scanner sc;
	   public static void main (String [] args ){
	int Number; 
	int  umber , Temp,Reminder, Times =0;
	   double sum =0;
	   sc =new Scanner (System.in);
	   System.out.println("\n Please Enter number to check :");
	   Number = sc.nextInt();
	  Temp = Number;
	   while ( Temp !=0) {
	   Times = Times + 1;
	   Times = Temp/ 10;
	  }
	Temp = Number ;
	while (Temp > 0){
	  Reminder = Temp %10;
	   sum =sum +Math.pow(Reminder,Times);
	   Temp =Temp /10;
	   }
	   System.out.format("\n sum of entered is = %2f",sum);
	  if (sum ==Number){
	   System.out.format("\n% d is armstrong number",Number);
	  }
	  else{
	        System.out.format("\n% d not armstrong number",Number);
	    }
	   }
	  }
