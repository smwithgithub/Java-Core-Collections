package stackwitharray;

public class StackWithArray{
	int n =5;
	int arr[]= new int[n];
	
	int back=-1;
	
	public void push(int value) {
		if(back>=5) {
			System.out.println("The stack is OverFlow!!");
		}
		else {
			back++;
			arr[back]=value;
			
		}
	}
	
	public void pop() {
		if(back==-1) {
			System.out.println("The stack is UnderFlow");
		}
		else {
			arr[back]=00;
			back--;
		}
	}
	
	public void display() {
		System.out.println("\nElements are: ");
		
		if(back==-1) {
			System.out.println("Empty Stack");
		}
		
		for(int i = 0; i<=back;i++) {
			System.out.print(arr[i]);
			System.out.println();
		}
	}
	
}