package package1;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("principal amount");
		double P = sc.nextDouble();
		System.out.println("the Rate");
		double R= sc.nextDouble();
		System.out.println("the time span");
		double T =sc.nextDouble();
		
		double CI = P*Math.pow(1+(R/100), T);
		System.out.println(CI);

	}

}
