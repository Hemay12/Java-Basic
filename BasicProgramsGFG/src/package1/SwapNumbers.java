package package1;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int x = sc1.nextInt();
		System.out.println("Enter the 2nd number");
		int y = sc1.nextInt();
		
		int z = x;
		x=y;
		y=z;
		
		System.out.println(x+" "+y);

	}

}
