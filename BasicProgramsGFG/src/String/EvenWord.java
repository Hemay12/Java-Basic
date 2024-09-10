package String;

import java.util.Arrays;
import java.util.Scanner;

public class EvenWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = sc.nextLine();
		
		String a[] = str.split(" ");
		//System.out.println(Arrays.toString(a));
		
		for(int i=0; i <a.length;i++) {
			int x =a[i].length();
			if(x%2 ==0) {
				System.out.println(a[i]);
			}
			//System.out.println(a[i].length());
		}	

	}

}
