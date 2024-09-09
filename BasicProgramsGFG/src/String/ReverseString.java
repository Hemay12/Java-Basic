package String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the string you want to reverse");
		String str = sc.next();
		StringBuilder str2 = new StringBuilder(str);
		
		for (char ch =0;ch<=str.length()-1;ch++) {
			System.out.println(str.charAt(ch));
			str2.setCharAt(str.length()-1-ch,str.charAt(ch));
		}
		System.out.println("===========");
		System.out.println(str2);
	}

}
