package ClassAndObject;

class Area{
	int len;
	int bre;
	
	Area(int length, int breath){
		this.len = length;
		this.bre = breath;
	}
	
	void getArea() {
		System.out.println(len*bre);
	}
}

public class Encap1 {

	public static void main(String[] args) {
		Area a1 = new Area(12,4);
		a1.getArea();	
	}

}
