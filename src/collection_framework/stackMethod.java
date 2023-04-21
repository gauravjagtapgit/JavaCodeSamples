package collection_framework;
import java.util.Iterator;
import java.util.Stack;
import java.util.ListIterator;

public class stackMethod {

	public static void main(String[] args) {
		
		Stack s =new Stack();
		
		s.push("gaurav");
		s.push("jagtap");
	    s.push("cleaver");
	    s.push("#");
	    s.push(200);
	    s.push(100.10);
	    
	    System.out.println(s);
	   System.out.println(s.pop());
	   System.out.println(s);
//	   System.out.println(s.pop());
//	   System.out.println(s);
	   
	   System.out.println(s.peek());
	   System.out.println(s);
	   
	   System.out.println(s.search("cleaver"));
	   
	   System.out.println(s.empty());
	   
	   System.out.println(s.size());
	   
	   
	   Iterator cursor=s.iterator();
	   
	   while(cursor.hasNext()) {
//		   Object value = cursor.next();
//		   System.out.println(value);
		   
		  System.out.println(cursor.next());
	   }
	   System.out.println("<<<<<<<<revers>>>>>>>>>>");
	   ListIterator cursor1 =   s.listIterator(s.size());
	   
//	   while(cursor1.hasNext()) {
//		   System.out.println(cursor.next());
//	   }
	   while(cursor1.hasPrevious()) {
		   System.out.println(cursor1.previous());
	   }

	}

}







