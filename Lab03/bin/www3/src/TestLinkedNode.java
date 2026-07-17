
public class TestLinkedNode {

	public static void main(String[] args) {
		Node node1 = new Node("Alice");
		display(1, node1);
		System.out.println();
		Node node2 = new Node(25);
		display(2, node2);
		System.out.println();
		Node node3 = new Node(true);
		System.out.println();
		display(3, node3);
		System.out.println();
		Node node4 = new Node(17.5);
		display(4, node4);
		
		node1.next = node2;
		display(1, node1);
		
		node2.next = node3;
		display(2, node2);
		
		node3.next = node4;
		display(3, node3);
		display(4, node4);
		
		System.out.print(node1.next.data);
	

	}

	public static void display(int num_node, Node node) {
		System.out.println("node" + num_node + "deta = " + node.data);
		System.out.println("node" + num_node + "address = " + Node.getAddress(node));
		System.out.println("node" + num_node + "pointer address => " + Node.getAddress(node.next));
	}
}
