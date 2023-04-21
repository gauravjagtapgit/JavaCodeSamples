package Arrays;

public class first_duplicat_element {

	public static void main(String[] args) {
		
		
		int []a= {6,5,3,2,5,1,2,4};
		
		int temp=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if((a[i]==a[j]) && (i != j)){
					temp=temp+1;
					System.out.println("First Duplicat Element is ---> "+a[j]);
					break;
				}
			}
			if(temp>0) {
				break;
			}
		}

	}

}
