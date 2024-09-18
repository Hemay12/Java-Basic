package Methods;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] heamy) {
		Scanner sc = new Scanner(System.in);
		
		Bank_Account ac1 = new Bank_Account();
		ac1.GetAccountDetails();
		ac1.DisplayAccountDetails();
		
		String message = "Not Found";
		System.out.println("Enter Account Number to search: ");
		double AccNo = sc.nextInt();
		
		message = ac1.Search(message,AccNo, ac1);
		System.out.println(message);

	}
}

class Bank_Account{
	double Account_No,Account_Balance;
	String User_Name;
	
	Scanner sc = new Scanner(System.in);
	
	void GetAccountDetails() {
		System.out.println("Enter Account no");
		Account_No = sc.nextDouble();
		System.out.println("Enter User_name");
		User_Name = sc.next();
		System.out.println("Enter Account_Balance");
		Account_Balance = sc.nextDouble();
	}
	
	void DisplayAccountDetails() {
		System.out.println("Details of the employee :-");
		System.out.println(Account_No);
		System.out.println(User_Name);
		System.out.println(Account_Balance);
	}
	
	String Search(String message, double AccNo, Bank_Account ac) {
		if(AccNo == (ac.Account_No)) {
			message = "Found";
		}
		return message;
	}
	
}



