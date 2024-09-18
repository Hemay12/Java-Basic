package p1;

public class Encapsulation {

	public static void main(String[] args) {
		Customer emp = new Customer("PS",343,343);
		emp.getdetails();
		emp.setName("VS");
		emp.setSalary(7500);
		emp.getdetails();
	}
}

class Customer{
	private String name;
	private int emp_id;
	private double salary;
	
	public Customer(String NAME, int id, double Salary){
		this.name = NAME;
		this.emp_id = id;
		this.salary = Salary;	
	}
	
	public String getName() {
		return name;
	}
	
	public String setName(String NAME) {
		return this.name = NAME;
	}
	
	public int getId() {
		return emp_id;
	}
	
	public int setId(int id) {
		return this.emp_id = id;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public double setSalary(double Salary) {
		return this.salary = Salary;
	}
	
	public void getdetails() {
		System.out.println("Name is "+ name);
		System.out.println("Id is "+ emp_id);
		System.out.println("Salary is "+ salary);
	}
	
	
}
