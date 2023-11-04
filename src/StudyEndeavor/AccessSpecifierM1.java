package StudyEndeavor;

public class AccessSpecifierM1 {

	
	private int a=20;
	int b=30;
	protected int c=40;
	public int d=50;
	
	private void add() {
		a=b+c;
		System.out.println("private method "+a);
	}
	 void min() {
		b=c-d;
		System.out.println("Default method "+b);
	}
	protected  void mul() {
		c=d*a;
		System.out.println("Protected method "+c);
	}
	public void total() {
		a=b+c+d;
		System.out.println("Public method "+d);
	}
	public static void main(String[] args) {
		AccessSpecifierM1 as=new AccessSpecifierM1();
		System.out.println(as.a);
		System.out.println(as.b);
		System.out.println(as.c);
		System.out.println(as.d);
		
		System.out.println("-------------------");
		
		as.add();
		as.min();
		as.mul();
		as.total();
	}
	
	
}
