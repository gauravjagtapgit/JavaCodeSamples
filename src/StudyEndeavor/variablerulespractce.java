package StudyEndeavor;

public class variablerulespractce {
	 
	
	static int x=200;
	
	int b=30;
   public int d=40;
   public String base ;
   
 public void varaible() {
	
	 int a=20;
	 System.out.println(a);
	 int c=b;//instance variable for non-static method direct access
	 int v=x;
  }
 
 public static void variable2() {
	 int c=30;
	// private int d=30;--can't public,private & protected
	// int a=c+b;can't access cause method is static
	
 }
 
 void variablerulespractce() {
	 
	 System.out.println(x);
	
 }
 
	public static void main(String[] args) {
		int a=22;
		
		System.out.println(a);
		variablerulespractce object1=new variablerulespractce();
		System.out.println(object1.b);// instance variable for static method not direct access
		System.out.println(object1.d);
		System.out.println(object1.base);//give us default value
		System.out.println(object1.x);//static variable for object crate cause method is static
	   
		System.out.println(object1.u);
		System.out.println(object1.v);
		
		object1.u=100;
		object1.v=200;
		
		variablerulespractce object2=new variablerulespractce();
		System.out.println(object2.u);//instance variable value are not change
		System.out.println(object2.v);// were static variable value are change
		
	}
	int u=11; //instance variable
	static int v=22;//static variable
	
	
}









