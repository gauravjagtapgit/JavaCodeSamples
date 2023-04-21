package collection_framework;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetMethods {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Object> ls =new LinkedHashSet<>();
		
		ls.add(20);
		ls.add("gaurav");
		ls.add("##");
		ls.add(10);
		ls.add(30);
		ls.add("jjjjj");
		System.out.println(ls);
		
		Iterator lh=ls.iterator();
		while(lh.hasNext()) {
			System.out.println(lh.next());
		}
		System.out.println(ls.size());
	}

}
