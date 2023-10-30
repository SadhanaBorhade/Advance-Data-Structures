package core;

import java.util.Scanner;

public class QueueTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Queue queue = new Queue(5);
			boolean exit = false;
			while (!exit) {
				System.out.println("Options:\n" + "1.Enqueue\n" + "2.Dequeue\n" + "3.Display\n" + "0.Exit\n");
				System.out.println("Enter your choice:");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter the element to insert into queue");
						queue.enqueue(sc.nextInt());
						queue.enqueue(sc.nextInt());
						queue.enqueue(sc.nextInt());
						queue.enqueue(sc.nextInt());
						queue.enqueue(sc.nextInt());
						break;
					case 2:
						int q = queue.dequeue();
						System.out.println(q);
						break;
					case 3:
						System.out.println("Displaying all element");
						queue.display();
						break;
					case 0:
						exit = true;
						System.out.println("Thank you!!!");
						break;
					default:
						System.out.println("Enter valid choice...");
						exit=true;
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
