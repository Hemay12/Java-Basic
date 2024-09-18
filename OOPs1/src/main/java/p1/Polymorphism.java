package p1;
//Overriding 
public class Polymorphism {

	public static void main(String[] args) {
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		Animal myCow = new Cow();
		
		myDog.sound();
		myCat.sound();
		myCow.sound();
	}
}

class Animal{
	public void sound() {
		System.out.println("This is animal sound");
	}
}

class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("Sound of Dog");
	}
}

class Cat extends Animal {
    // Overriding sound method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    // Overriding sound method
    @Override
    public void sound() {
        System.out.println("Cow moos");
    }
}