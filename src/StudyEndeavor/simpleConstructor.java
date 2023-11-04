package StudyEndeavor;

public class simpleConstructor {
	
	String name;
	int empid=100;
		 simpleConstructor(String name,int empid) {
			this.name=name;
			this.empid=empid;
		}
		  @Override
		    public String toString() {
		        return "Name: " + name + ", EmpID: " + empid;
		    }
		 public static void main(String[] args) {
			 simpleConstructor e1=new simpleConstructor("gaurav",100);
			 simpleConstructor e2=new simpleConstructor("jagtap",101);
			 simpleConstructor e3=new simpleConstructor("john",102);
			 System.out.println(e1);
			 System.out.println(e2);
			 System.out.println(e3);
		}
		
	}


