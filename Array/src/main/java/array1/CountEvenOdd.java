package array1;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		int x;
		int a[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		x=sc.nextInt();
		a = new int[x];
		int ecount =0,ocount = 0;
		
		for(int i =0;i<x;i++) {
			System.out.println("Enter the "+i);
			a[i] = sc.nextInt();
			
			if(i%2==0) {
				ecount = ecount + 1;
				//System.out.println("hua");
			}
			else {
				ocount = ocount +1;
				//System.out.println("huaO");
			}
		}
		System.out.println(ecount +" "+ ocount);

	}

}
