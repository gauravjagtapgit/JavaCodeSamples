package StudyEndeavor;

public class multilevelA {
	
	static String company="Apple";
	int price=22000;
	String processor="ios";
	void show() {
		this.price=price;
	}
	void getA() {
		System.out.println(this.company+"="+price+"&"+this.processor);
	}
}
