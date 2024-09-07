package ClassAndObject;

public class abstraction {

	public static void main(String[] args) {
		 Animal myDog = new Dog("Buddy");
		 myDog.makeSound();
		
	}
}

abstract class Animal{
	private String name;
	
	public Animal (String name) {this.name =name;}
	public abstract void makeSound();
	
	public String getName() {return name;}
}

class Dog extends Animal{
	public Dog(String name) { super(name);}
	
	public void makeSound() {
		System.out.println(getName() +"Barks");
	}

}
