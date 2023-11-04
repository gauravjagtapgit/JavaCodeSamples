package StudyEndeavor;

public class methodPracticClassA {
	
	int c=30;
	static int e=22;
	
	public static void seewithststic() {
		int a=11;
		int b=20;
		methodPracticClassA instamceVarabale=new methodPracticClassA();//method is static so we crate object 
		int d=a+b+instamceVarabale.c+e;
		System.out.println("seewithststic==>"+d);
	}
	public void seewithoutststic() {
		int a=40;
		int b=50;
		int d=a+b+c+e;
		System.out.println("seewithoutststic"+d);
	}
	public static boolean seewithretuerntype() {
	
		methodPracticClassA instamceVarabale2=new methodPracticClassA();
		if(instamceVarabale2.c==instamceVarabale2.e) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		return false;
		
	}
	public double seeWithreturnNumber(double c) {
		
		double a=70;
		c=a+c+e;
		System.out.println("seeWithreturnNumber==>"+c);
		return c;
	}
public static void main(String[] args) {
	methodPracticClassA.seewithststic();
	methodPracticClassA.seewithretuerntype();
	
	
	methodPracticClassA myclassObject=new methodPracticClassA();
	myclassObject.seewithoutststic();
	myclassObject.seeWithreturnNumber(e);
	System.out.println();
}

}
