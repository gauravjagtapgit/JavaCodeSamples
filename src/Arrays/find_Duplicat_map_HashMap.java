package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class find_Duplicat_map_HashMap {

	public static void main(String[] args) {
//		not-by using set interface  we find duplicate element
		
		find_Duplicat_map_HashMap.DuplicatElement();
	
	}
		public static void DuplicatElement() {
		int[]arr= {3,5,4,3,2,2,1,3,4,5,7,5};
		
		Map<Integer,Integer> hm = new HashMap<>();
		
		for(int no:arr) {
			Integer count=hm.get(no);
			if(count==null) {
			hm.put(no,1);
		}
		else {
		 count=count+1;
		hm.put(no, count);
		}
	 }
		System.out.println("Dupicat Element are:");
		Set<Map.Entry<Integer,Integer>> es = hm.entrySet();
		
		for(Map.Entry<Integer,Integer> me : es) {
			if(me.getValue() > 1) {
				System.out.println(me.getKey()+" - is Duplicat element");
			}
		 }	
	   }
	 }



