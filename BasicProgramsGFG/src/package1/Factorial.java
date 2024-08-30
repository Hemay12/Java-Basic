package package1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Factorial of number");
		int a = sc.nextInt();
		sc.close();
		int sum=1;
		
		for(int i =a;i>0;i--) {
			//System.out.println(i);
			sum*=i;
		}
		System.out.println(sum);

	}

}
