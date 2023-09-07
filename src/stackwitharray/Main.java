package stackwitharray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackWithArray s = new StackWithArray();
		
		s.push(20);
		s.push(22);
		s.push(15);
		s.push(24);
		s.push(10);
		s.display();
		
		s.pop();
		s.display();
		
		s.pop();
		s.pop();
		s.display();
		
		s.pop();
		s.pop();
		s.display();
		
		s.pop();
		
	}

}
