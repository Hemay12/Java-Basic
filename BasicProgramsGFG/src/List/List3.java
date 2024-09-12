package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		Collections.addAll(list, 1,2,3,4);
		System.out.println("List "+ list.toString());
		
		List<Integer> list1 = Collections.unmodifiableList(Arrays.asList(1,2,3));
		System.out.println("Unmodifiable List "+list1.toString());
		
		//list1.add(5);
		//System.out.println("Unmodifiable List "+list1.toString());
	}

}
