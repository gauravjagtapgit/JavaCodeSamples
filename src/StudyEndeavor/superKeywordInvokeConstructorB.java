package StudyEndeavor;

public class superKeywordInvokeConstructorB extends superKeywordInvokeConstructorA{
	
	superKeywordInvokeConstructorB(){
		super();
		System.out.println("I am Parent class Constructor");
		
	}
	superKeywordInvokeConstructorB(int i){
		super(22);
		System.out.println("child class value==> "+i);
	}
	public static void main(String[] args) {
		superKeywordInvokeConstructorB ob=new superKeywordInvokeConstructorB(30);
		superKeywordInvokeConstructorB ob2=new superKeywordInvokeConstructorB();
	
	}
	

}
