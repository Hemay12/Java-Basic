package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1, 2, 3);  //immutable list
		System.out.println("List : " + list1.toString());
		
		List<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6));
		list2.add(7);
		System.out.println("Mutable list :"+ list2.toString());
	}

}
