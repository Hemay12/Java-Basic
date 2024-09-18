package patterns;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number for Pascal triangle");
//		int y = sc.nextInt();
//		
//		int a =y*2 -1;
//		int sum =1;
//		
//		for (int i=1;i<y+1;i++) {
//			
//			for(int k=1;k<i;k++) {
//				System.out.print(" ");
//			}
//			for(int j=sum;j<a+1;j++) {
//				System.out.print("1");
//			}
//			sum=sum+2;
//			System.out.println();
		
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i =0; i<a.length;i++) {
			System.out.println("Enter the "+i+" number");
			int x = sc.nextInt();
			a[i] = x;
			System.out.println(a[i]);
		}
		
		
		
	}

}
