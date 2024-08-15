package package1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int a = sc.nextInt();
		
		if((a%400 == 0 || a%100 !=0 && a%4 ==0 )  ) {
			System.out.println(a+" Year is leap year");
		}
		else {
			System.out.println(a+ " year is not leap year");
		}
		
	}

}
