package package1;

import java.util.Scanner;

public class DifferentCharacterInWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.next();
		
		boolean x = hasUniqueCharacters(str);
		System.out.println(x);
		}
	
	public static boolean hasUniqueCharacters(String input) {
		boolean unique = true;
		input = input.toLowerCase();
		char arr[] = input.toCharArray();
		for(int i =0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					unique = false;
					break;
				}
			}
		}
		return unique;
		}

	}

	


