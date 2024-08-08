package package1;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to compare ?");
		int count = sc.nextInt();
		int[] numbers = new int[count];   // Array to store the numbers
		
		for(int j=0;j<=count-1;j++) {
			System.out.println("Enter "+j+" number");
			numbers[j] = sc.nextInt();			
		}
		
		int largest = numbers[0];
		for(int i=1;i<count-1;i++) {
			if (numbers[i] < largest) {
				largest = numbers[i];
			}
		} 
		
		System.out.println("The largest number is "+ largest);
	}

}
