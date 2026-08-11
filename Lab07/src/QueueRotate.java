import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueRotate {

	static Queue<Integer> queue = new ArrayDeque<Integer>();

	public static void originalQueue() {

		for (int i = 101; i <= 107; i++) {
			queue.add(i);
		}

		System.out.println("Original Queue: " + queue);
	}

	public static void rotateQueue() {

		int first = queue.remove();
		queue.add(first);

		System.out.println("Rotate Queue: " + queue);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		originalQueue();

		while (true) {

			System.out.print("Enter number: ");
			int number = input.nextInt();

			if (number == 1) {
				rotateQueue();
			} else {
				break;
			}
		}

		System.out.println("Exit");

		input.close();
	}
}