package Testing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
	
		HashMap<String, Integer> add = new HashMap<String, Integer>();
		add.put("satish", 222);
		add.put("akash", 777);
		add.put("nandu", 999);
		add.put("harish1", 228);
		add.put("sanju", 675);
		add.put("darani", 4563);
		add.put("harish", 678);
		
		System.out.println(add);
		
		System.out.println(add.get("darani"));//getting perticular person value
		
	Set<String> keys =add.keySet();//getting all keys value from the hashmap
	for(String key:keys) {
		System.out.println(key);
	
	}
    Set<Map.Entry<String,Integer>> aa=add.entrySet();//getting all keys and values from hashmap
    for( Map.Entry<String,Integer> entry:aa) {
    	System.out.println(entry);
    }

	}
}