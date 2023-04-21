package Arrays;

public class finnd_mini_number {

	public static void main(String[] args) {
		
		int[]a= {12,4,13,44,23,67,14,87,90};
		int min=a[0];
     for(int i=1;i<a.length;i++) {
    	 if(min > a[i]) {
    		 min=a[i];
    	 }
     }
     System.out.println("minimum Number is ===> "+min);
	}

}
