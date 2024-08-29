package package1;

import java.util.Scanner;

public class VowelConsonant {
	
	static void vowel_or_consonant(char y) {
		Character.toLowerCase(y);
		if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
	            || y == 'u') 
	            System.out.println("It is a Vowel."); 
	        else
	            System.out.println("It is a Consonant.");
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the character");
		String x = sc.next();
		
		if(x.length()==1) {
			vowel_or_consonant(x.charAt(0));
		}
		else {
			System.out.println("Enter only 1 character");
		}
		
	}
	
}

