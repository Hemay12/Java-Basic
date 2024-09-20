package package1;

import java.util.Scanner;

public class LengthOflongestSubStringUnique {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.nextLine();
		
		int len = lengthOfLongestSubstring(str);
		System.out.println(len);
	}
	
	public static int lengthOfLongestSubstring(String str){
		
		boolean unique = true;
		str = str.toLowerCase();
		String arr[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for (int i =0;i<arr.length;i++) {
			
			char ch[] = arr[i].toCharArray();
			middleLoop:
			for (int j=0; j<ch.length;j++) {
				for(int k=j+1;k<ch.length;k++) {
					if(ch[j] != ch[k]) {
						sb.append(arr[i]).append(" ");
						break middleLoop;
					}
				}
			}
		}
		//System.out.println(sb);
		
		String strsb []= sb.toString().split(" ");
		int maxlength=0;
		//String maxString= "";
		for (String max : strsb) {
			if(max.length() > maxlength	) {
				maxlength = max.length();
				//maxString = max;
			}
		}
		//System.out.println(maxString);
		return maxlength;
	}

}
