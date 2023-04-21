package collection_framework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class iterator_listiterator_methods {
	public static void main(String[] args) {
		List li=new ArrayList();
		
		li.add(10);
		li.add("gaurav");
		li.add("#");
		li.add(100);
		li.add("iterator");
		li.add('s');
		System.out.println(li);
    System.out.println("________iteratorform________");
    
    Iterator start=li.iterator();
     while(start.hasNext()) {
    	 System.out.println(start.next());
     
         } 
     System.out.println("________ListIteratorform________");
     
     ListIterator revers=li.listIterator();
 
 //   1) first we need to cursor in last object then previous operation occur    
     while(revers.hasNext()) {
    	 System.out.println(revers.next());
     }
     System.out.println("<<<<<<<<<<<<privious>>>>>>>>>>>>>>>");
//     2) cursor at last object hence we write previous method
     while(revers.hasPrevious()){
    	System.out.println(revers.previous()); 
     }
	}
	
}
