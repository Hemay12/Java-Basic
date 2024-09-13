package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommaSeparated {

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
		String str = String.join(",", list);
		System.out.println(str);

	}

}
