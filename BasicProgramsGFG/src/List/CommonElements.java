package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonElements {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int a = sc.nextInt();
		for(int i=0; i<a;i++) {
			System.out.println("Enter the "+i+" element");
			list.add(sc.next());
		}
		
		System.out.println(list);
		
		List<String> list1 = new ArrayList<String>();
		System.out.println("Enter the number of elements in the array");
		int b = sc.nextInt();
		for(int i=0; i<b;i++) {
			System.out.println("Enter the "+i+" element");
			list1.add(sc.next());
		}
		
		System.out.println(list1);
		
		List<String> list2 = new ArrayList<String>();
		
		for(String str : list) {
			if(list1.contains(str)) {
				list2.add(str);
			}
			
		}
		
		System.out.println(list2);
	}

}
