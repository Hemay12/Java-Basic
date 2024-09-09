package String;

import java.util.Scanner;

public class SwappingCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		StringBuilder str2 = new StringBuilder(str) ;
		
		char ch []= str.toCharArray();
		int a = ch.length;
		System.out.println(a);
		
		for (int i = 1; i<a;i+=2) {
			char ch2 = str.charAt(i-1);
			str2.setCharAt(i-1, str.charAt(i));
			str2.setCharAt(i, ch2);
		}
		
		System.out.println(str2);
	}

}
