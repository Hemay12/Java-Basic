package array1;

import java.util.Scanner;

public class LinearSearchArray {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		int a [] = new int[n];
		
		for(int i =0;i<a.length;i++) {
			System.out.println("Enter the "+i);
			a[i]= sc.nextInt();
		}
		System.out.println("Enter the number you want find in array using linear search");
		int x = sc.nextInt();
		for(int j =0;j<a.length;j++) {
			if (x==a[j]) {
				System.out.println("Found");
				break;
			}
			else {
				System.out.println("Not Found");
			}
		}

	}

}
