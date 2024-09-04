package array1;

import java.util.Scanner;

public class MultiplicationOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arr1 and arr2");
		int size1= sc.nextInt();
		int a[][] = new int[size1][size1];
		int b[][] = new int[size1][size1];
		int c[][] = new int[size1][size1];
		
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size1;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the arr2");
		
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size1;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Multiplicaiton of arr1 and arr2");
		
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size1;j++) {
				c[i][j]=a[i][j] * b[i][j];
				System.out.print("c["+i+"]["+j+"]:" + c[i][j]+" \t");
			}
			System.out.println();
		}
		

	}

}
