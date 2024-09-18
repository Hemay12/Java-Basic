package String;

import java.util.Scanner;

public class SplitStringIntoSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		
		char ch [] = str.toCharArray();
		//System.out.println(String.valueOf(ch));
		
		for (int j =0; j<ch.length;j++) {
			System.out.println(ch[j]);
		}
		int i =0;
		while(i<str.length()-1) {
			String str1 = str.substring(i);
			System.out.println(str1);
			i++;
		}
		System.out.println("==============================");
		
		int k =str.length();
		for(int j =k; j>0;j--) {
			System.out.println(str.substring(j));
		}		
		
	}

}
