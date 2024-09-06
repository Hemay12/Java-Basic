package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size the arr");
		int size = sc.nextInt();
		int []n= new int[size];
		int newsize = size;
		
		for (int i=0;i<size;i++) {
			System.out.println("Enter the "+i);
			n[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(n));
		
		for(int k=0; k<newsize;k++) {
			for (int j =k+1;j<newsize;j++) {
				if(n[k]==n[j]) {
					System.out.println(n[k]+" is duplicate");
					for (int m = j; m < newsize - 1; m++) {
		                n[m] = n[m + 1];
		            }
					newsize--;
					j--;
				}
				
			}	
		}
		for (int i = 0; i < newsize; i++) {
		    System.out.print(n[i] + " ");
		}
		
	}

}
