package package1;

public class BinaryString {

	public static void main(String[] args) {
		String x = "1011";
		String y = "1011";
		
		int number = Integer.parseInt(x,2); // x is binary and converted into decimal
		int number1 = Integer.parseInt(y,2); //if y is octal then Interger.parseInt(y,8) then y is converted into decimal
		
		String result = Integer.toString(number1+number); 
		
		System.out.println("Sum of "+x+" "+y+" is "+ result);
		
	}

}
