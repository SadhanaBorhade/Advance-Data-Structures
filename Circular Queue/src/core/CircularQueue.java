package core;

public class CircularQueue {
	private int front;
	private int rear;
	private int[] queue;
	private int capacity;

	public CircularQueue(int capacity) {
		this.front = -1;
		this.rear = -1;
		this.queue = new int[5];
		this.capacity = capacity;
	}

	public boolean isFull() {
		if (rear == queue.length-1)
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		if (front == -1)
			return true;
		else
			return false;
	}

	public void enqueue(int element) {
		if (isFull())
			throw new RuntimeException("Queue is full!!!");
		else {
			rear = (rear + 1) % capacity;
			queue[rear] = element;
			System.out.println("Element is added!!");
			//System.out.println(front);
			if (front == -1) {
				front = rear;
			}
		}

	}

	public int dequeue() {
		if (isEmpty())
			throw new RuntimeException("Queue is Empty!!!");
		else {
			int element = queue[front];
			System.out.println("Element is dequeue successfully" + element);
			front = (front + 1) % capacity;
			return element;
		}
	}
	
	public void display()
	{
		for(int i=0;i<queue.length;i++)
			System.out.println(queue[i]);
	}
}
