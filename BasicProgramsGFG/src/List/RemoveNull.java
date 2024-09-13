package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveNull {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int a = sc.nextInt();
		for(int i=0; i<a;i++) {
			System.out.println("Enter the "+i+" element");
			list.add(sc.nextInt());
		}
		
		list.add(null);
		System.out.println(list.toString());
		int j=0;
		
		while(list.size() > j) {
			if(list.get(j) == null) {
				list.remove(j);
			}
			else {
				j++;
			}
		}
		System.out.println(list);

	}

}
