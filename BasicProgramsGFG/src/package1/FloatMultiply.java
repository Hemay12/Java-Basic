package package1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FloatMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		float f1 = sc.nextFloat();
		System.out.println("Enter the second number");
		float f2 = sc.nextFloat();
		float f3 = f1*f2;
		
		DecimalFormat df = new DecimalFormat("#.00");
		String s = df.format(f3);
		
		System.out.println("Result of multiplication of "+f1+" and "+f2+" is "+ f3);

	}

}
