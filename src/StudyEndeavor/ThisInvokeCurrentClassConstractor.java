package StudyEndeavor;

public class ThisInvokeCurrentClassConstractor {

	
	ThisInvokeCurrentClassConstractor(){
		//this(10);
		System.out.println("the method with no argument");
	}
	ThisInvokeCurrentClassConstractor(int a){
     	this();
		System.out.println("the method with argument");
	}
	public static void main(String[] args) {
	//	ThisInvokeCurrentClassConstractor arg=new ThisInvokeCurrentClassConstractor();
		ThisInvokeCurrentClassConstractor arg=new ThisInvokeCurrentClassConstractor(10);
		
	}
	
}

