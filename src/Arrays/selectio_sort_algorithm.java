package Arrays;

public class selectio_sort_algorithm {

	public static void main(String[] args) {
		
		int[]a= {36,54,14,99,2,62};
		int min,temp=0;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=1+i;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
