package String;

import java.util.Scanner;

public class LeadingZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String str = sc.next();
		
		str = removeZero(str);
		System.out.println(str);
	}
	
	public static String removeZero(String str) {
		int i = 0;
		StringBuffer sb = new StringBuffer(str);
		while(i < sb.length() && sb.charAt(i) == '0') {
			
			sb.replace(0,i+1, "");
		}
		return sb.toString();
		
	}
}
