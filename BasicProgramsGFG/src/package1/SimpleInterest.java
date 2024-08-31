package package1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float P = sc.nextFloat();
		float R= sc.nextFloat();
		float N =sc.nextFloat();
		
		float SI = (P*R*N)/100;
		System.out.println("Simple Interest = "+SI);

	}

}
