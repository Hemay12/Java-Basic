package package1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a =0;
		int b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N till you want to print");
		int num = sc.nextInt();
		sc.close();
		int sum=0;
		
		for (int i =1; i<num;i++) {
			sum = a +b;
			System.out.print(sum+" ,");
			a=b;
			b=sum;
		}

	}

}
