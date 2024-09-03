package patterns;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		
		for (int i=1;i<=a;i++) {
			for(int j=a-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<i+1;k++) {
				System.out.print(1*i);
			}
			for(int l=1;l<i;l++) {
				System.out.print(1*i);
			}
			System.out.println();
		}

	}

}
