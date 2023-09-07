package queuewitharray;

import javax.sound.midi.Soundbank;

public class QueueOperation {
	
	int n=5;
	
	int arr [] = new int [n];
	
	int front=-1;
	int back=-1;
	

	
	public void enqueue(int value) {
		if(back==n-1) {
			System.out.println("The Queue is Overflow!!");
			
		}
		
		else {
			
			
			if(back== -1 && front==-1) {
				
				front = 0;
				back = 0;
				arr[back]=value;
				
			}
			else {
				back+=1;
				arr[back]= value;
			}
		}
		
		
		
	}
	
	
	public void deQueue() {
		
		if(front==-1 && back == -1) {
			System.out.println("The Queue is Underflow");
		}
		
		
		else {
			arr[front]=00;
			front+=1;
			
		}
		
	}
	
	public void display() {
		System.out.println("Elements Are: ");
		
		for (int i=front;i<=back;i++) {
			System.out.print(arr[i]+" ");
			System.out.println();
		}
	}
	
	
	

}
