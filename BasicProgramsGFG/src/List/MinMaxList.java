package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMaxList {
	
	static List<Integer> list = new ArrayList<Integer>();
	static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		System.out.println("Enter the list of 4 Integer");
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
	
		System.out.println("List is "+list.toString());
		int maxi = 	max();
		System.out.println("Max is "+ maxi);
		int mini = 	min();
		System.out.println("Max is "+ mini);
		
			
	}
	
	static int max(){
		int maxi=list.get(0);
		for(int i = 0;i<4;i++) {
			if(list.get(i)>maxi) {
				maxi = list.get(i);
			}
		}
		return maxi;
	}
	
	static int min() {
		int mini = list.get(0);
		for(int j =0; j<4;j++) {
			if(list.get(0)<mini) {
				mini = list.get(j);
			}
		}
		
		return mini;
	}

}
