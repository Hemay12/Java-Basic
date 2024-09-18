package ClassAndObject;

public class ThisKeyword {
	
	int a , b;
	
	ThisKeyword(){
		a=10;
		b=20;
	}

	ThisKeyword get() {return this;}
	
	void display() {
		System.out.println("a = " + a + "  b = " + b);
	}
	
	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword();
		tk.get().display();

	}

}
