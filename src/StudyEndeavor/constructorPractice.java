package StudyEndeavor;

public class constructorPractice {
	
	int age=30;
	String name;
	constructorPractice(int age,String name){
		this.age=age;
		this.name=name;
	}
	public static void main(String[] args) {
		constructorPractice nameage=new constructorPractice(30,"jacob");
		System.out.println(nameage.age+" "+nameage.name);
	}

}
