package package1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseStringLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.nextLine();
		
		String reverse = reverseWords(str);
		System.out.println(reverse);
	}
	public static String reverseWords(String sentence) {
		
		String[] list = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i =list.length -1; i>=0;i--) {
			sb.append(list[i]).append(" ");
		}
		
		return sb.toString();
	}

}
