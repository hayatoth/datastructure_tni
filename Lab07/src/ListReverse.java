import java.util.ArrayList;

public class ListReverse {

	public static ArrayList<Integer> reverseList(ArrayList<Integer> original) {
		
		ArrayList<Integer> reverse = new ArrayList<Integer>();

		for (int i = original.size() - 1; i >= 0; i--) {
			reverse.add(original.get(i));
		}

		return reverse;
	}

	public static void main(String[] args) {

		ArrayList<Integer> original = new ArrayList<Integer>();

		for (int i = 11; i <= 20; i++) {
			original.add(i);
		}

		System.out.println("Original List: " + original);
		System.out.println("Reverse List: " + reverseList(original));
	}
}