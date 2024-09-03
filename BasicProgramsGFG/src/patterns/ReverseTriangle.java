package patterns;

import java.util.Scanner;

public class ReverseTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int y = sc.nextInt();
		int a = y*2 -1;
		int sum =1;
		for (int i = 1;i<y+1;i++) {
			
			for (int k =1;k<i;k++) {
				System.out.print(" ");
			}
			
			for(int j=sum;j<a+1;j++) {
				System.out.print("*");
			}
			sum=sum+2;
			
			System.out.println();
		}
				
	}
}
