package Arrays;

public class find_mising_number {
	
	public static void main(String []args){

		 int[] a={1,2,3,4,6,7};

		int expectedno=a.length+1;
		int totalno= expectedno*(expectedno+1)/2;
		System.out.println(totalno);

		 int sum=0;
		for(int i=0;i<a.length;i++){
		  sum=sum+a[i];
		}
		System.out.println("mising number is: "+(totalno-sum));

		}

}
