package p1;
//overLoading
public class Polymorphism1 {

	public static void main(String[] args) {
		MathOperation math = new MathOperation();
		
		System.out.println("sum of 2 integers " + math.add(5, 10));
		System.out.println("sum of 3 integers " + math.add(5, 10,15));
		System.out.println("sum of 2 double " + math.add(5.5, 6.3));
	}

}

class MathOperation{
	public int add (int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
}
