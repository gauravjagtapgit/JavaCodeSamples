package StudyEndeavor;

public class methodPracticClassB{
	
	public static void main(String[] args) {
		methodPracticClassA.seewithststic();
		methodPracticClassA.seewithretuerntype();
		
		methodPracticClassA myclassObject=new methodPracticClassA();
		myclassObject.seewithoutststic();
	//	myclassObject.seeWithreturnNumber(e);//static variable not access directly==>for that extends the class 
		methodPracticClassB myclassObject3= new methodPracticClassB();
	System.out.println("myRetuern sum ia "+myclassObject3.myRetuern(2, 5));
	}
 public int myRetuern(int a,int b) {
	 
	 int sum=a+b;
	 return sum;
	 
	 
	 
	 
	 
 }
}
