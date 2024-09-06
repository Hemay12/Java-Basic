package array1;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int a [] = new int[size];
		
		for(int j = 0; j<a.length;j++) {
			System.out.println("Enter the "+j);
			a[j] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));

	}

}
