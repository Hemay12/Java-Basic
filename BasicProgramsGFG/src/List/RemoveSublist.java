package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveSublist {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in list");
		int size = sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the "+i+ " element");
			list.add(sc.nextInt());
		}
		
		List<Integer> list1 = list.subList(2,4);
		System.out.println();
		list.removeAll(list1);
		
		System.out.println(list);
		
	}

}
