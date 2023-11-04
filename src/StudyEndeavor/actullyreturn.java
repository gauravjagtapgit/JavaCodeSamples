package StudyEndeavor;

public class actullyreturn {
   public returnMathod getexicuted(int number) {
	   return new returnMathod(number);
   }
 
   public static void main(String[] args) {
	   actullyreturn num=new actullyreturn();
	   returnMathod onenum=num.getexicuted(23);
	   System.out.println(onenum.getnumber());
	
	   
	   
}
}
