package core;

import java.util.EmptyStackException;

public class Stack {
	private int[] stack;
	private int top;

	public Stack() {
		this.stack = new int[5];
		this.top = -1;
	}

	public boolean IsFull() {
		if (top == stack.length - 1)
			return true;
		else
			return false;
	}

	public boolean IsEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public void push(int element) {
		if (IsFull())
			throw new RuntimeException();
		else {
			++top;
			stack[top] = element;
			System.out.println("Element is added!!" + element);
		}

	}

	public int pop() {
		if (IsEmpty())
			throw new EmptyStackException();
		else {
			int element = stack[top];
			top--;
			System.out.println("In pop");
			return element;
		}
	}

	public int peek() {
		if (IsEmpty())
			throw new EmptyStackException();
		else {
			return stack[top];
		}
	}
	
	public void display()
	{
		for(int a:stack)
			System.out.println(a);
	}
}
