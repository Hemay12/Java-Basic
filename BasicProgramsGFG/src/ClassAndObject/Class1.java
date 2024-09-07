package ClassAndObject;

public class Class1 {

	public static void main(String[] args) {
		hemay h1 = new hemay();
		h1.setFirst("Hemay",22);
		h1.getFirst();

	}

}

class hemay {
	
	String name;
	int age;

	void getFirst() {
		System.out.println(name);
		System.out.println(age);
	}
	
	void setFirst(String n, int a) {
		name = n;
		age = a;
	}
	
}
