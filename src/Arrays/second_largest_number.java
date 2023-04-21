package Arrays;

public class second_largest_number {

	public static void main(String[] args) {
		
		int[]a= {6,8,2,4,3,1,5,7,9,23,45};
		
		int temp;             
		for(int i=0;i<a.length;i++) {      //sorting list is descending order
			for (int j=i+1;j<a.length;j++) {
				if(a[i] < a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i= 0;i<a.length;i++) { //see descending list
			System.out.print(a[i]+" ");
		}
       System.out.println("second largest number is ===> "+a[1]);
	}

}
