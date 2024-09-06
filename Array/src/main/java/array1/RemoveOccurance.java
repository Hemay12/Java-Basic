package array1;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int a [] = new int[size];
		
		for(int j = 0; j<a.length;j++) {
			System.out.println("Enter the "+j);
			a[j] = sc.nextInt();
		}
		
		System.out.println("Enter the element you want to remove from the array");
		int rm = sc.nextInt();
		
		a = removeElement(a,rm);
		System.out.println(Arrays.toString(a));
	}

	public static int[] removeElement(int[] a, int rm) {
		int index =0;
		for(int i =0; i<a.length;i++) {
			if(a[i] != rm) {
				a[index++] = a[i];
			}
		}
		return Arrays.copyOf(a, index);
	}

}
