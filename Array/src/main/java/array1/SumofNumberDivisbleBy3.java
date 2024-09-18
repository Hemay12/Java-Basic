package array1;

import java.util.Scanner;

public class SumofNumberDivisbleBy3 {

	public static void main(String[] args) {
		int n;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int [] a = new int[n];
		
		for (int i=0;i<n;i++) {
			System.out.println("Enter the "+i);
			a[i] = sc.nextInt();
			
			if(a[i]%3==0 || a[i]%5==0) {
				sum = sum +a[i];
			}
			
		}
		
		System.out.println(sum);

	}

}
