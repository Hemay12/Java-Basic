package package1;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while (true) {
            System.out.println("Enter the number to check even or odd:");

            if (sc.hasNextInt()) {
                i = sc.nextInt();
                
                if (i > 0) {
                    if (i % 2 == 0) {
                        System.out.println("Entered number is Even");
                    } else {
                        System.out.println("Entered number is Odd");
                    }
                    break; // Exit the loop after a valid input is processed
                } else {
                    System.out.println("Invalid input, please enter a positive number.");
                }
            } else {
                System.out.println("Invalid input, please enter a number.");
                //sc.next(); // Consume the invalid input
            }
        }
        
        sc.close();
    }
}
