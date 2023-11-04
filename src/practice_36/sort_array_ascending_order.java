package practice_36;

public class sort_array_ascending_order {

	
	  public static void main(String[] args) {
	        int[] a = {32, 55, 70, 12};
	        int temp;

	        for (int i = 0; i < a.length; i++) {
	            for (int j = i + 1; j < a.length; j++) {
	                if (a[i] > a[j]) {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }

	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
	    }
}
