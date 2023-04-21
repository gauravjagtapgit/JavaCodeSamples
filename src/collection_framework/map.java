package collection_framework;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class map {
	public static void main(String[] args) {
		
		Map <String,String> map= new HashMap<>();
		//1
		map.put("Name", "Gaurav");
		map.put("LastName", "Jagtap");
		map.put("Location", "Belser");
		map.put("job", "?");
		
		System.out.println(map);
		System.out.println("--------<<<<>>>>>----------");
		//2
		Set<String>keys=map.keySet();
		
		for(String key:keys) {
			System.out.println(key+" "+ map.get(key));
		}
		System.out.println("--------<<<<>>>>>----------");
		
		//3
		System.out.println(map.get("LastName"));
		
	}

}
