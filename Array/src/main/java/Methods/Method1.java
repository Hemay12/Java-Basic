package Methods;

import java.util.Scanner;

//Create a class named Candidate with Candidate_ID, Candidate_Name, Candidate_Age,
//Candidate_Weight and Candidate_Height data members. Also create a method
//GetCandidateDetails() and DisplayCandidateDetails(). Create main method to demonstrate
//the Candidate class.

public class Method1 {

	public static void main(String[] args) {
		Candidate cn = new Candidate();
		
		cn.GetCandidateDetails();
		cn.DisplayCandidateDetails();
		
		//hello there
	}
}

class Candidate{
	int Candidate_ID, Candidate_Age,Candidate_Weight,Candidate_Height;
	String Candidate_Name;
	Scanner sc =new Scanner(System.in);
	
	void GetCandidateDetails() {
		System.out.println("Enter the Candidate_ID");
		Candidate_ID = sc.nextInt();
		System.out.println("Enter the Candidate_Name");
		sc.nextLine();
		Candidate_Name = sc.nextLine();
		System.out.println("Enter the Candidate_Age");
		Candidate_Age = sc.nextInt();
		System.out.println("Enter the Candidate_Weight");
		Candidate_Weight = sc.nextInt();
		System.out.println("Enter the Candidate_Height");
		Candidate_Height = sc.nextInt();
	}
	
	void DisplayCandidateDetails() {
		System.out.println("\nCandiate Details:-");
		System.out.println("Candidate ID : "+Candidate_ID);
		System.out.println("Candidate Name : "+Candidate_Name);
		System.out.println("Candidate Age : "+Candidate_Age);
		System.out.println("Candidate Weight : "+Candidate_Weight);
		System.out.println("Candidate Height : "+Candidate_Height);
	}
	
}
