package Arrays;

public class scond_smallest_number {
	
public static void main(String[] args) {
		
		int[]a= {6,8,2,4,3,1,5,7,9,23,45};
		
		int temp;        //for swap     
		for(int i=0;i<a.length;i++) {      //sorting list is Ascending order
			for (int j=i+1;j<a.length;j++) {
				if(a[i] > a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i= 0;i<a.length;i++) { //see Ascending list
			System.out.print(a[i]+" ");
		}
       System.out.println("second largest number is ===> "+a[1]);
	}

}


