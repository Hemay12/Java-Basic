package array1;

import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size the arr");
		int size = sc.nextInt();
		int []n= new int[size];
		
		for (int i=0;i<size;i++) {
			System.out.println("Enter the "+i);
			n[i]=sc.nextInt();
		}
		
		int smallest = n[0];
				
		for(int k=0; k<size;k++) {
			if(n[k]<smallest) {
				smallest = n[k];
			}
		}
		
		System.out.println(smallest);

	}

}
