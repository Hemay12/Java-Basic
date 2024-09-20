package package1;

import java.util.HashMap;

public class BasicHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("Cherry", 3);
		
		System.out.println("Value of Apple:" + map.get("Apple"));
		
		if(map.containsKey("Banana")) {
			System.out.println("Banana is in the map");
		}
		
	}
	
}
