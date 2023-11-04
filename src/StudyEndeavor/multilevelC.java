package StudyEndeavor;

public class multilevelC extends multilevelB {
	static String company ="motrolo";
	int price=1500;	;
	void getC() {
		System.out.println(this.company+"="+this.price+"&"+this.processor);
		
	}
	public static void main(String[] args) {
		multilevelA A= new multilevelA();
		A.getA();
		System.out.println("----------------------");
		multilevelB B= new multilevelB();
		B.getA();
		B.getB();
		System.out.println("----------------------");
		multilevelC C= new multilevelC();
		C.getA();
		C.getB();
		C.getC();
		
	}

}
