package StudyEndeavor;

public class thisUseCurrentClassReferInstanceVariable {
	
	int name;
	void value(int name){
//	name=name;//if you not write this(it doesn't differentiate),so ambiguity is occur it show 0 value
		this.name=name;
	}
  void	getvalue() {
	  System.out.println(name);
  }
  public static void main(String[] args) {
	  thisUseCurrentClassReferInstanceVariable check=new thisUseCurrentClassReferInstanceVariable();
	check.value(100);
	check.getvalue();
	
	
	check.m2("fine");
}
  
  void m1() {
	  System.out.println("practice pourpouse only:) ");
  }
  void m2(String withparameter) {
	  this.m1();
  }
  

}
