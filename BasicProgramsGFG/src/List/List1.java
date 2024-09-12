package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class List1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		System.out.println("List is " + list.toString());
		
		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(2);
		list1.add(4);
		System.out.println("LinkedList is "+ list1.toString()); 
		
		List<Integer> list2 = new Stack<Integer>();
		list2.add(5);
		list2.add(6);
		System.out.println("Stack "+ list2.toString());
		
	}

}
