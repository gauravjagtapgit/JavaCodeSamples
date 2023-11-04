package StudyEndeavor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetMehodsPractice {
	
	public static void main(String[] args) {
		Set<Object > st= new HashSet<>();
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);
		System.out.println(st);
		Iterator bb=st.iterator();
		while(bb.hasNext()) {
			System.out.println(bb.next());
		}
	}

}
