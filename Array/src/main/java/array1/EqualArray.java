package array1;

import java.util.Scanner;

public class EqualArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the arr1");
		int size = sc.nextInt();
		int arr [] = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+i);
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of the arr2");
		int size2 = sc.nextInt();
		int arr2 [] = new int[size2];
		
		for (int i =0;i<arr2.length;i++) {
			System.out.println("Enter the arr2"+i);
			arr2[i] = sc.nextInt();
		}
		
		if (arr.length == arr2.length) {
			for(int k =0;k<arr.length;k++) {
				boolean areEqual = true;
				if(arr[k] != arr2[k]) {
					areEqual = false;
					break;
				}
				if(areEqual) {
					System.out.println("Array equal");
				}
				else {
					System.out.println("Array not equal");
				}
			}
		}
		else {
			System.out.println("Array not equal");
		}

	}

}
