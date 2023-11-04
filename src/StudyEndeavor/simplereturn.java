package StudyEndeavor;

public class simplereturn {
	
	public int[] evenarray(int count) {
		int [] evennum=new int[count];
		for(int i=0;i<count;i++) {
			evennum[i]=2*i;
		}
		return evennum;
	}
 public static void main(String[] args) {
	 simplereturn evn=new simplereturn();
	int[] result= evn.evenarray(5);
	for(int num:result) {
		System.out.print(num+" ");
	}  
}
}
