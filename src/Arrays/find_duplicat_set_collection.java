package Arrays;
import java.util.Set;
import java.util.HashSet;
public class find_duplicat_set_collection {

	public static void main(String[] args) {
		
//		Note--1) Set collection method does not allow Duplicate number
		
		int []a= {3,5,4,3,2,2,1};
		
		System.out.println("Duplicat Element is :");
		
		Set<Integer> s=new HashSet<>();
		
		for(int no:a) {
		if(s.add(no)==false) {
			System.out.println(no+" ---> is Dublicat Element");
		}
      }	
	}
}
