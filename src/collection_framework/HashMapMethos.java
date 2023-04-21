package collection_framework;
import java.util.*;
import java.util.Map.Entry;

public class HashMapMethos {
	public static void main(String[] args) {
		
		//country(key),count(value)
		
		HashMap<String, Integer>map=new HashMap<>();
		
		map.put("India",130);
		map.put("Rasia", 100);
		map.put("Us", 115);
		map.put("England", 90);
		map.put("South Koria", 110);
		
		System.out.println(map);
		
		System.out.println(map.get("India"));
		
		map.put("Us",120);
		System.out.println(map);
		
		//Search
		
	  if(map.containsKey("India")) {
		  System.out.println("key is presant in the map");
	  }
	  else {
		  System.out.println("key is not presant in the map");
	  }
	  //again search out of map
	  
	  System.out.println(map.get("India"));
	  
	  System.out.println(map.get("Indonesia"));
	  
	  //Iterate
	  System.out.println("------<<Travers map>>-----");
	  
	  for(Entry<String, Integer> e:map.entrySet()) {
		  System.out.println(e.getKey()+e.getValue());
		  
		  System.out.println(e.getValue());
	  }
	  //second way
	 System.out.println("<<<<<<<<second way to Iterat>>>>>>>");
	   
    Set<String>	keys=  map.keySet();
    for(String key:keys) {
	  System.out.println(key+" "+map.get(key));
	   }
	}	
}
	
	


