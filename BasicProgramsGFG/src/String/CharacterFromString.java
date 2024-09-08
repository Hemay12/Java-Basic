package String;

import java.util.Scanner;

public class CharacterFromString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the WOrd");
		
		String a = sc.next();
		
		System.out.println("Enter the index you want to print");
		
		int x = sc.nextInt();
		
		if (x<a.length()) {
			System.out.println(a.charAt(x));
			}
		else {System.out.println("Out of Index");}

	}

}
