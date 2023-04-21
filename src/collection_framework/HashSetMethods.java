package collection_framework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethods {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<>();
		 hs.add(10);
		 hs.add(20);
		 hs.add(30);
		 hs.add(40);
	     hs.add(10);
	     System.out.println(hs.contains(hs));
		 System.out.println(hs);
		 hs.remove(1);
		 System.out.println(hs);
		
		Iterator h= hs.iterator();
		while(h.hasNext()) {
			System.out.println(h.next());
		 }
	}
}
