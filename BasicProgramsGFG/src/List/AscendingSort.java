package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AscendingSort {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int a = sc.nextInt();
		for(int i=0; i<a;i++) {
			System.out.println("Enter the "+i+" element");
			list.add(sc.nextInt());
		}
		
		int [] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i); 
        }
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
 
	}

}
