package Arrays;

public class selectio_sort_algorithm_string {

	public static void main(String[] args) {
		
		String[]ord= {"gaurav","rohit","zinu","munna","aniket","badmash","kiran"};
		int min;
		String temp=null;
		for(int i=0;i<ord.length;i++) {
			min=i;
		
		for(int j=i+1;j<ord.length;j++) {
			if(ord[j].compareTo(ord[min])<0) {
				min=j;
			}
			
		}
		temp=ord[i];
		ord[i]=ord[min];
		ord[min]=temp;
	}
		for(int i=0;i<ord.length;i++) {
			System.out.print(i+")"+ord[i]+" ");
		}
	}
}
