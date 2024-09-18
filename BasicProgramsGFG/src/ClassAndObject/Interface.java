package ClassAndObject;

interface getName{
	int a=10;
	void name(int a);
	void age();
}

class interface2 implements getName{
	@Override
	public void name(int name) {
		System.out.println("Interface2 "+name);
		
	}
	
	@Override
	public void age() {
		System.out.println("InterfaceA2");
	}
}

public class Interface {

	public static void main(String[] args) {
		interface2 in1 = new interface2();
		in1.name(5);
	}

}
