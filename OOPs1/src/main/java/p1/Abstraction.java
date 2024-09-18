package p1;

public class Abstraction {

	public static void main(String[] args) {
		FullTime ft = new FullTime("PS" , 66, 9000);
		ft.getdetails();
		System.out.println(ft.salary());
	}
}

abstract class Cust{
	String name;
	int id;
	
	public Cust(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void getdetails() {
		System.out.println("Name is "+name);
		System.out.println("Id is "+id);
	}
	
	public abstract double salary();
}

class FullTime extends Cust{
	
	double salary;
	
	public FullTime(String name, int id, double salary ) {
		super(name, id);
		this.salary  = salary;
	}
	
	@Override
	public double salary() {
		return salary;
	}
	
}