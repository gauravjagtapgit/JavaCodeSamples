package StudyEndeavor;

public class superKeywordB extends superKeywordA{
	
	int i=10;
	void demo2(int i) {
		System.out.println("1) reference variable of B class value==>"+i);
		
		System.out.println("2) instance variable value==>"+this.i);
		
		System.out.println("3) instance variable value of A(parent class)==>"+super.i);
		
		super.demo(33);
	}
	public static void main(String[] args) {
		superKeywordB ob1=new superKeywordB();
		ob1.demo2(30);
		//ob1.demo(33);
	}

}
