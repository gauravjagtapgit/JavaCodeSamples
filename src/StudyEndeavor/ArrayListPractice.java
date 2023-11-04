package StudyEndeavor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import collection_framework.iterator_listiterator_methods;

public class ArrayListPractice {
	
	public static void main(String[] args) {

		ArrayList a= new ArrayList<>();
		a.add("gaurav");
		a.add("gaurav1");
		a.add("gaurav2");
		a.add("gaurav3");
		System.out.println(a);
		
		ArrayList b= new ArrayList<>();
		b.add(11);
		b.add(22);
		b.add(33);
		b.add(44);
		b.add(33);
		System.out.println(b);
		System.out.println(b.addAll(a));
		b.remove(0);
		ArrayList n=new ArrayList<>(a);
		System.out.println(n);
		a.set(0,"jagtap");
		System.out.println(a);
     System.out.println(a.contains("gaurav1"));
     System.out.println(a.indexOf("gaurav2"));
   //   Iterator ir=a.iterator();
//      while(ir.hasNext()) {
//    	  System.out.println(ir.next());
//     }
      ListIterator ir=a.listIterator();
//      while(ir.hasNext()) {
//    	  System.out.println(ir.next());
//	}
      while(ir.hasPrevious()) {
    	  System.out.println(ir.previous());
	}

	
	}
	
	
}
