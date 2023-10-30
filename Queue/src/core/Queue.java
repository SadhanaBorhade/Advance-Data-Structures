package core;

import EmptyQueueException.EmptyQueueException;

public class Queue {
	private int front;
	private int rear;
	private int []queue;
	private int capacity;
	
	
	public Queue(int capacity)
	{
		this.front=-1;
		this.rear=-1;
		this.queue=new int[5];
		this.capacity=capacity;
	}
	
	public boolean isFull()
	{
		if(rear==queue.length)
			return true;
		else
			return false;
	}
	public boolean isEmpty()
	{
		if(front==rear)
			return true;
		else
			return false;
	}
	
	public void enqueue(int element) {
		if (isFull())
			throw new RuntimeException();
		else {
			if(front==-1)
			{
				front=0;
			}
			rear++;
			queue[rear] = element;
			//front;
			System.out.println("Element is added!!");
			System.out.println(front);
		}

	}

	public int dequeue() throws EmptyQueueException {
		if (isEmpty())
			throw new EmptyQueueException("Queue is Empty!!!");
		else {
			int element = queue[front];
			System.out.println("Element is dequeue successfully" + element);
			front++;
			return element;
		}
	}
	
	public void display()
	{
		for(int a:queue)
			System.out.println(a);
	}
}
