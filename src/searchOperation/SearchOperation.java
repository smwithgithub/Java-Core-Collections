package searchOperation;

import java.util.Scanner;

public class SearchOperation{
	int arr[]= {1,2,5,7,5,6,4};
	
	Scanner scanner = new Scanner(System.in);
	
	public void search() {
		System.out.print("Enter the value you want to search: ");
		int check = scanner.nextInt();
		
		boolean notFound = true;
		
		for(int i=0; i<arr.length; i++) {
			if(check==arr[i]) {
				System.out.println("Search result: "+arr[i] +" is saved in index of "+i);
				notFound=false;
			}
		}
		if(notFound== true)System.out.println("Your data is not found!!");
	}
}