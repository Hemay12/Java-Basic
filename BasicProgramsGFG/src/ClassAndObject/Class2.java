package ClassAndObject;

interface in{
	int jk = 25;
	void display();
}

public class Class2 implements in{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 in = new Class2();
		in.display();
		System.out.println(in.jk);

	}
	@Override
	public void display(){
		System.out.println("Hey there");
	}

}
