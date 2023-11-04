package StudyEndeavor;

public class superKeywordInvokeParentclassMethodB extends superKeywordInvokeParentclassMethodA {
	
	void m1() {
		System.out.println("I am chiled class Method");
	}
	void m2(int a) {
		System.out.println("Intiger value of child is "+a);
	}
	void showResult() {
		m1();
		super.m1();
		m2(60);
		super.m2(70);
	}
	public static void main(String[] args) {
		superKeywordInvokeParentclassMethodB clout=new superKeywordInvokeParentclassMethodB();
		clout.showResult();
	}


}
