package p1;

public class Inheritance {

	public static void main(String[] args) {
		Manager manager = new Manager("PS", 66, 9000);
		manager.getdetails();
		System.out.println("Salary with bonus is "+manager.calculateSalary());
	}
}

class Employee {
    String name;
    int Emp_id;

    Employee(String NAME, int id) {
        this.name = NAME;
        this.Emp_id = id;
    }


	void getdetails() {
        System.out.println("Name of the employee: " + name);
        System.out.println("ID of the employee: " + Emp_id);
    }
    
    double calculateSalary() {
    	return 50000;
    }
    
}

class Manager extends Employee{
	int bonus;

	Manager(String NAME, int id, int BONUS) {
		super(NAME, id);
		this.bonus = BONUS;
	}
	
	@Override
	void getdetails() {
		super.getdetails();
		System.out.println("Bonus of the emplyee is "+ bonus);
	}
	
	@Override
	double calculateSalary() {
		super.calculateSalary();
		return (super.calculateSalary() + bonus);
	}
	
}
