package StudyEndeavor;

public class overridingB extends overridingA {
	void show() {
		System.out.println("child mehod");
		super.show();
	}
	void show2(String a) {
		System.out.println("child mehod name");
	}
	public static void main(String[] args) {
		overridingA test=new overridingA();
		test.show();
		test.show2("abc");
		
		overridingB test2=new overridingB();
		test2.show();
		test2.show2("abc");
		
		
	}

}
