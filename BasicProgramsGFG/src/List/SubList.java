package List;

import java.util.ArrayList;
import java.util.List;

public class SubList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		System.out.println(list);
		
		List<Integer> list2 = list.subList(2, 4);
		System.out.println(list2);
	}

}
