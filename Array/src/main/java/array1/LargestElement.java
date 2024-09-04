package array1;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size the arr");
		int size = sc.nextInt();
		int []n= new int[size];
		int greatest =0;
		
		for (int i=0;i<size;i++) {
			System.out.println("Enter the "+i);
			n[i]=sc.nextInt();
		}
		
		for(int j=0; j<size;j++) {
			if(n[j]>greatest) {
				greatest = n[j];
			}
		}

		System.out.println(greatest);
	
	}

}
