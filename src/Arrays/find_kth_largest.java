package Arrays;

public class find_kth_largest {

	public static void main(String[] args) {
		int []a= {2,6,4,1,8,5,23,45,78,30,28};
        
		int k=4;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] < a[j]) {
					int tem=a[i];
					a[i]=a[j];
					a[j]=tem;
				}
			}
			if(i==k-1) {
				System.out.println(k+" largest element ia :"+a[i]);
				break; //only k number are sort(otherwise its sort all no)
			}
		}
		System.out.println("-------->>>>><<<<<---------");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
			
	}

}
