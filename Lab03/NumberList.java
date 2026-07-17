
public class NumberList {

	public static void main(String[] args) {
		LinkedList numlist = new LinkedList();
		numlist.insert(0, 37);
		numlist.insert(0, 7);
		numlist.insert(0, 4);
		numlist.insert(0, 16);
		
		System.out.println(numlist.travetsal());
		
		numlist.insert(2, 20);
		System.out.println(numlist.travetsal());
		
		numlist.insert(25);
		System.out.println(numlist.travetsal());
		numlist.remove(0);
		System.out.println(numlist.travetsal());
		numlist.remove(2);
		System.out.println(numlist.travetsal());
		numlist.removeLastElement();
		System.out.println(numlist.travetsal());
	
		System.out.println("length = " + numlist.length());
		System.out.println("Node 2 = " + numlist.get(2));
		numlist.set(1, 100);
		System.out.println(numlist.travetsal());
		numlist.clear();
		System.out.println(numlist.travetsal());
		
	}

}
