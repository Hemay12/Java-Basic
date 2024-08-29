package package1;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		if(a<b) {
			for(int i=a;i<=b;i++) {
				int originalN = i;
				int result =0;
				int n = String.valueOf(i).length();
				
				while(originalN!=0) {
					int remainder = originalN%10;
					result += Math.pow(remainder, n);
					originalN /= 10;
				}
				if (result == i) {
	                System.out.println(i);
	            }
			}
		}
		else {
			System.out.println("Enter a>b numbers");
		}
	}

}