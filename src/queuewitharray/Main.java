package queuewitharray;

public class Main{
	public static void main(String [] argStrings) {
		
		QueueOperation q = new QueueOperation();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(23);
		q.enqueue(30);
		q.enqueue(50);
		
		q.display();
		
		q.deQueue();
		q.display();
		
		q.deQueue();
		q.display();
		
		
		
	}
}