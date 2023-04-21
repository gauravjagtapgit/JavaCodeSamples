package Arrays;

public class binary_search {

	public static void main(String[] args) {
		
// rules-->>>1)binary search occur when array list is sorted 
//       ----->> 2) If give list is not sorted then first sorted and then we search binary search

		int[]a= {2,5,7,9,12,14,16,17,19,20,24,28};
		
		int search=16;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		
		while(li <= hi) {
			
			if(a[mi]==search) {
				System.out.println("element is at "+mi+" index position");
				break;
			}
			else if(a[mi] < search) {
				li=mi+1;
			}
			else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
//		if(li>hi) {
//			System.out.println("element not found");
//		}
	}

}
