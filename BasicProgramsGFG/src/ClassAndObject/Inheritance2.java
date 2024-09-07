package ClassAndObject;

interface a1{
	void print_name();
}

interface a2 extends a1{
	void print_age();
}

interface a3 extends a1,a2{
	void print_name();
}

class child implements a3{

	@Override
	public void print_age() {
		System.out.println("age is just a number");
	}

	@Override
	public void print_name() {	
		System.out.println("Name is name");
	}
	
}
public class Inheritance2 {

	public static void main(String[] args) {
		
		child c = new child();
		c.print_age();
		c.print_name();
	}

}
