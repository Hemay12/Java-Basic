package ClassAndObject;

class Bank{
	private long currBalance=0;
	long bank_id;
	String name;
	
	public long getBalance(long id) {
		if(this.bank_id == id) {
			return currBalance;
		}
		return -1;
	}
	
	public void setBalance(long balance, long id) {
		if(this.bank_id == id) {
			currBalance = balance + currBalance;
		}		
	}	
}

public class dataHiding {

	public static void main(String[] args) {
		Bank bk = new Bank();
		bk.bank_id = 1234;
		//bk.name="Hemay";
		bk.setBalance(999, 1234);
		System.out.println(bk.getBalance(1234));

	}

}
