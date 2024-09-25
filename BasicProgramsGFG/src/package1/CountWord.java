package package1;

import java.util.HashMap;
import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		HashMap<String, Integer> hash = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the StringLine");
		String str = sc.nextLine();
		str = str.replaceAll("\\p{Punct}", "");
		str = str.toLowerCase();		
		String arr[] = str.split(" ");
		
		for(String words : arr) {
			if(hash.containsKey(words)) {
				hash.put(words,hash.get(words)+1);
			}
			else {
				hash.put(words,1);
			}
		}
		System.out.println(hash);
	}

}
