package StudyEndeavor;

public class ThisPassArgumentClassMethod {
	
	void m1(ThisPassArgumentClassMethod td) {
		System.out.println("I am m1 method");
	}
	void m2() {
		m1(this);
	}
  public static void main(String[] args) {
	  ThisPassArgumentClassMethod td= new ThisPassArgumentClassMethod();
	  td.m2();
}
}
