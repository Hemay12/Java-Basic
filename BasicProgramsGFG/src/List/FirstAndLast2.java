package List;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FirstAndLast2 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int a = sc.nextInt();
		for(int i=0; i<a;i++) {
			System.out.println("Enter the "+i+" element");
			list.add(sc.nextInt());
		}
		
		System.out.println(list);
		System.out.println(list.getFirst()+"= First and Last ="+ list.getLast());
		list.addFirst(999);
		list.addLast(888);
		System.out.println(list);
		

	}

}
