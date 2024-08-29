package package1;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check its neon or not");
		int neon = sc.nextInt();
		sc.close();
		int sq = neon*neon;
		int sum=0;
		while(sq!=0) {
			int remainder = sq%10;
			sum +=remainder;
			sq /= 10;
		}
		if(sum==neon) {System.out.println(sum+" is a Neon number");}
		else {System.out.println(sum+" is NOT a Neon number");}

	}

}
