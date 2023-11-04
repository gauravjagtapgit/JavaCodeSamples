package StudyEndeavor;

public class ThisInvokeCurrentClassMethod {
	
	void display() {
		System.out.println("Hello Thear");
	}
	void UnDisplay(int a) {
		this.display();
	}
	public static void main(String[] args) {
		ThisInvokeCurrentClassMethod result=new ThisInvokeCurrentClassMethod();
		result.UnDisplay(10);
	}

}
