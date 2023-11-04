package StudyEndeavor;
//import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
public class Inumerator_practice {
	
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(20);
		li.add(10);
		li.add(30);
		li.add(40);
		li.add(50);
		
		System.out.println(li);
		
		List le =new LinkedList();
		
		le.add("jg");
		le.add("gaurav");
		le.add("jagtap");
		System.out.println(le);
		
		System.out.println(li.addAll(le));
		
	Iterator s=	li.iterator();
	while(s.hasNext()) { 
		for(int i=0;i<li.size();i++) {
	System.out.println(i+")-["+s.next()+"]");	
	}}
	System.out.println(">>>>>>>>>|Bckward|<<<<<<<<<<<<");
	
	ListIterator s1=le.listIterator();
	while(s1.hasNext()) {
		System.out.println(s1.next());}
	for(int i=2;i<0;i--) {
	while(s1.hasPrevious()) {
		System.out.println(i+")-["+s1.previous()+"]");
	}}
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	Iterator a=	le.iterator();
	while(a.hasNext()) { 
		for(int i=0;i<li.size();i++) {
	System.out.println(i+")-["+a.next()+"]");	
	}}
	
	}
}
