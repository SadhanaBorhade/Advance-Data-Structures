package core;

import java.util.Scanner;

public class StackTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Stack stack = new Stack();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options:\n" + "1.Push\n" + "2.Pop\n" + "3.Peek\n" + "0.Exit\n");
				System.out.println("Enter your choice:");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter the element to push into stack");
						stack.push(sc.nextInt());
						stack.push(sc.nextInt());
						stack.push(sc.nextInt());
						stack.push(sc.nextInt());
						stack.push(sc.nextInt());
						break;
					case 2:
						int t = stack.pop();
						System.out.println(t);
						break;
					case 3:
						int p = stack.peek();
						System.out.println(p);
						break;
					case 0:
						exit = true;
						System.out.println("Thank you!!!");
						break;
					default:
						exit=true;
						System.out.println("Enter valid choice...");
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}
	}

}
