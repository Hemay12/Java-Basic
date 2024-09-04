package array1;

import java.util.Scanner;

public class TwoDimensionArray {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size = sc.nextInt();
		int a [] [] =new int [size][size];
		
		for(int i=0; i<size;i++) {
			for(int j=0;j<size;j++) {
				//System.out.print("Enter the ["+i+"] ["+j+"]");
				a[i][j]= sc.nextInt();
			}
		}
		
		for(int i =0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print("a["+i+"]["+j+"]:" + a[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
