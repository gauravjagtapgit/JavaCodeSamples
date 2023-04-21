package collection_framework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMethod {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts =new TreeSet<>();
		ts.add(22);
		ts.add(33);
		ts.add(44);
		ts.add(55);
		ts.add(66);
		
		System.out.println(ts);
		
		System.out.println(ts.clone());
		
		Iterator  it=ts.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+",");
		}
		System.out.println("First Element is : "+ts.first());
		System.out.println("Last Element is : "+ts.last());
		
		ts.remove(2);
			
		
	}

}
