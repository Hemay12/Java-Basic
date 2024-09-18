package String;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String text = sc.next();
		String output = sortstring(text);
		
		System.out.println(output);

	}
	
	public static String sortstring(String text) {
		char tempArr [] = text.toCharArray();
		Arrays.sort(tempArr);
		return new String(tempArr);
	}

}
