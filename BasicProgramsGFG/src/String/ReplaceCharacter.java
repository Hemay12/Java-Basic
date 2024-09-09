package String;

import java.util.Scanner;

public class ReplaceCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the WOrd");
		String word = sc.next();
		
		System.out.println("Enter the index you want to replace");
		int original = sc.nextInt();
		
		System.out.println("Enter the character you want to replace");
		String replace = sc.next();
		
		String str = word.substring(0, original) + replace + word.substring(original+1);	
		System.out.println(str);

	}

}