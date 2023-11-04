package StudyEndeavor;

public class returnTypeTest {
	
	public int employ(int salary,int bounes,int insentive) {
		int count=salary+bounes+insentive;
		System.out.println("Total employ Salary is : "+count);
		
		return count;
	}
	
	public static void main(String[] args) {
		returnTypeTest total=new returnTypeTest();
		int perMounth1=total.employ(2000, 2990, 330);
		int perMounth2=total.employ(3000, 2990, 330);
		System.out.println(perMounth1);
		System.out.println(perMounth1);
		total.justsee();
	}
	public int justsee() {
		int b=4;
		int c=6;
		int d=b+c;
	System.out.println(d);
		return d;
	}
	}


