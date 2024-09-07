package ClassAndObject;

class Encapsulate{
	int age;
	String name;
	
	public void setName(String n1) {
		this.name = n1;
	}
	public String getName() {return name;}
	
	public void setAge(int umar) {
		this.age = umar;
	}
	public int getAge() {return age;}
	
}

public class Encap2 {

	public static void main(String[] args) {
		Encapsulate ec = new Encapsulate();
		ec.setName("Hemay");
		ec.setAge(22);
		System.out.println("Name: " + ec.getName());  
        System.out.println("Age: " + ec.getAge());
	}

}
