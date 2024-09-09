package String;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		char[] alphabetArray = {
			    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
			    'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
			    'y', 'z'
			};
		
		String str = sc.next();
		
		char arr [] = str.toCharArray();
		
		boolean isPangram = true; 
		
		for (int i = 0; i < alphabetArray.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == alphabetArray[i]) {
                    found = true;
                    break; // Found the letter, no need to check further
                }
            }
            // Print if the letter was found or not
            if (!found) {
            	isPangram = false;
            	break;
            }
        }
		if (isPangram) {
            System.out.println("Pangram found.");
        } else {
            System.out.println("Pangram not found.");
        }
		
		
	}
}