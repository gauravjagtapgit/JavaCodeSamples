package StudyEndeavor;

public class mehodOverloading {
	
	void show() {
		System.out.println("1st method");
	}
	void show(int a) {
		System.out.println(a);
	}
	void show(String a) {
		System.out.println(a);
	}
	void show(String a,int b) {
		System.out.println(a+b);
	}
	void show(int a,String b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		mehodOverloading test=new mehodOverloading();
		test.show();
		test.show(22);
		test.show("gaurav");
		test.show(20,"gaurav");
		test.show("gaurav",30);
	}

}
