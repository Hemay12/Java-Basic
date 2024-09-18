package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitHalf {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in list");
		int size = sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the "+i+ " element");
			list.add(sc.nextInt());
		}
		
		int middle;
		
		if(list.size()%2 != 0) {
			middle = list.size()/2 +1;
		}
		else {
			middle = list.size()/2;
		}
		
		System.out.println(middle);
	}

}
