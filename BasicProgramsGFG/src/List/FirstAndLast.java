package List;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int a = sc.nextInt();
		for(int i=0; i<a;i++) {
			System.out.println("Enter the "+i+" element");
			list.add(sc.nextInt());
		}
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());

	}

}
