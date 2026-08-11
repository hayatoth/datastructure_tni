import java.util.Scanner;

public class SinglyApp {

	public static SinglyLinkedList list1 = new SinglyLinkedList();
	public static SinglyLinkedList list2 = new SinglyLinkedList();
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Test method 'append()'\n----------------------");
		testAppend();

		System.out.println("\nTest method 'get()'\n-------------------");
		testGet();

		System.out.println("\nTest method 'set()'\n-------------------");
		testSet();

		System.out.println("\nTest method 'contains()'\n-----------------------");
		testContains();

		System.out.println("\nTest method 'addAll()'\n---------------------");
		testAddAll();
	}

	public static void testAppend() {

		for (int i = 101; i <= 105; i++) {
			list1.append(i);
		}

		System.out.println("Current list = " + list1.displayList());
	}

	public static void testGet() {

		int i = 2;
		int j = 7;

		Object data1 = list1.get(i);
		Object data2 = list1.get(j);

		System.out.println("Get element index " + i + " = "
				+ (data1 == null ? "No data" : data1));

		System.out.println("Get element index " + j + " = "
				+ (data2 == null ? "No data" : data2));
	}
	public static void testSet() {

		list1.set(2, 111);
		System.out.println("list1 = " + list1.displayList());

		list1.set(7, 222);
		System.out.println("list1 = " + list1.displayList());
	}

	public static void testContains() {

		int find1 = 104;
		int find2 = 222;

		if (list1.contains(find1)) {
			System.out.println("104 found!!");
		} else {
			System.out.println("not found...");
		}

		if (list1.contains(find2)) {
			System.out.println(" found!!");
		} else {
			System.out.println("222 not found...");
		}
	}

	public static void testAddAll() {
		System.out.println("Elemnts in list1 => " + list1.displayList());
		System.out.println("Elemnts in list2 => " + list2.displayList());

		list1.addAll(list2);

		System.out.println("Merge result  => " + list1.displayList());
		for (int i = 201; i <= 205; i++) {
			list2.append(i);
		}

		System.out.println("Elemnts in list1 => " + list1.displayList());
		System.out.println("Elemnts in list2 => " + list2.displayList());
		list1.addAll(list2);

		System.out.println("Merge result => " + list1.displayList());
		list1.clear();

		System.out.println("Elemnts in list1 => " + list1.displayList());
		System.out.println("Elemnts in list2 => " + list2.displayList());
		list1.addAll(list2);

		System.out.println("Merge result => " + list1.displayList());
	}
}