package String;

import java.util.Scanner;

public class InsertString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String original = sc.next();
		
		System.out.println("At what Index you want to enter another string");
		int index = sc.nextInt();
		
		System.out.println("Enter the String you want to enter at "+index+" position");
		String added = sc.next();
		
		sc.close();
		
		char ch [] = original.toCharArray();
	
		for(int i =0; i<index+1; i++) {
			System.out.print(ch[i]);
		}
		System.out.print(" "+added+" ");
		
		for(int j =index+1; j<original.length();j++) {
			System.out.print(ch[j]);
		}

	}

}
