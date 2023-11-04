package StudyEndeavor;

public class covarientReturnTypeB extends covarientReturnTypeA{
	
	covarientReturnTypeB checkFunction2() {
		System.out.println("hi we will return B class value");
		return new covarientReturnTypeB();
	}
   public static void main(String[] args) {
	   covarientReturnTypeB B= new covarientReturnTypeB();
	   B.checkFunction1();
	   B.checkFunction2();
}
}
