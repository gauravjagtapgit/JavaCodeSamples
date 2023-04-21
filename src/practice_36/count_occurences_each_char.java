package practice_36;
import java.util.Map;
import java.util.HashMap;

public class count_occurences_each_char {

	public static void main(String[] args) {
		 String str = "Programming";
		  Map<Character,Integer> charMapCount = new HashMap<>();
		   
		   for(Character c : str.toCharArray()){
		    if(charMapCount.containsKey(c)){
		        charMapCount.put(c,charMapCount.get(c)+1);
		        }
		        else{
		          charMapCount.put(c,1);
		         }
		       }
		    System.out.println(charMapCount);
	}

}
