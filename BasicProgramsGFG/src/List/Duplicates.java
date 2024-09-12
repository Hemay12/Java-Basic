package List;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in list");
		int size = sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the "+i+ " element");
			list.add(sc.nextInt());
		}
		
		Set set = new LinkedHashSet<>();
		set.addAll(list);
		list.clear();
		list.addAll(set);
		System.out.println(list);
		

	}

}
