package package1;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap <String,Integer> map = new HashMap<>();
		
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("Cherry", 3);
		
		for(String Keys : map.keySet()) {
			System.out.println(Keys);
		}
		
		for(int value : map.values()) {
			System.out.println(value);
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ ": " + entry.getValue());
		}

	}

}
