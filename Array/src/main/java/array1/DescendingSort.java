package array1;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int a [] = new int[size];
		
		for (int i=0;i<a.length;i++) {
			System.out.println("Enter the "+i);
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int b [] = new int[size];
		for(int j =0;j<a.length;j++) {
			b[j] = a[size-1-j];
		}
		
		System.out.println(Arrays.toString(b));
	}

}
