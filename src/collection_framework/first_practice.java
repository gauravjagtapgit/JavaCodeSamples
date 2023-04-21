package collection_framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class first_practice {
	public static void main(String[]args) {
		ArrayList a= new ArrayList();
		a.add(10);
		a.add("gaurav");
		a.add('c');
		a.add("#");
		System.out.println(a);
		
		List name=new ArrayList();
		name.add(77);
		name.add("new");
		name.add("*");
		System.out.println(name.addAll(a));
		
		Set a1= new HashSet();
		a1.add(10);
		a1.add("gaurav");
		a1.add('c');
		a1.add("#");
		System.out.println(a);
		
	}

}
