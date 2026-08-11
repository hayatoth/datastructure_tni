class Node {
	public int data;
	public Node next;

	public Node(int value) {
		this.data = value;
		this.next = null;
	}
}

public class SinglyLinkedList {
	private Node head;
	private Node tail;

	public SinglyLinkedList() {
		head = null;
		tail = null;
	}

	public String displayList() {
		boolean first = true;
		String display = "[";

		for (Node current = head; current != null; current = current.next) {
			display += (!first ? ", " : "") + current.data;
			first = false;
		}

		display += "]";
		return display;
	}

	public void clear() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void append(int value) {
		Node new_Node = new Node(value);

		if (head == null) {
			head = new_Node;
			tail = new_Node;
		} else {
			tail.next = new_Node;
			tail = new_Node;
		}
	}

	public Object get(int position) {

		if (position < 0 || head == null) {
			return null;
		}

		Node current = head;

		for (int i = 0; i < position; i++) {

			if (current.next == null) {
				return null;
			}

			current = current.next;
		}
		
		return current.data;
	}

	public void set(int position, int value) {

		if (position < 0 || head == null) {
			System.out.println("Updated data fail...");
			return;
		}

		Node current = head;

		for (int i = 0; i < position; i++) {

			if (current.next == null) {
				System.out.println("Updated data fail...");
				return;
			}

			current = current.next;
		}

		current.data = value;

		System.out.println("Updated data success!!");
	}

	public boolean contains(int value) {
        if(!isEmpty()) {
        	Node current_node = head;
        	while (current_node != null && current_node.data != value) {
        		current_node = current_node.next;
        	}
			if (current_node != null) {
				return true;
			}
        }
		return false;
        }


	public void addAll(SinglyLinkedList otherlist) {

		for (Node current = otherlist.head; current != null; current = current.next) {
			append(current.data);
		}
	}
}