package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Merge2array {

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
		
		int arr3 [] = new int [size+size2];
		for(int i=0;i<arr.length;i++) {
			//System.out.println("Enter the "+i);
			arr3[i] = arr[i];
		}
		for(int i=0;i<arr2.length;i++) {
			//System.out.println("Enter the "+i);
			arr3[i+size] = arr2[i]; 
		}
		
		System.out.println("Merged Array: " +Arrays.toString(arr3));
		
		System.arraycopy(arr, 0, arr3, 0, size);
		System.arraycopy(arr2, 0, arr3, size, size2);
		
		System.out.println(Arrays.toString(arr3));
 
	}

}
