import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		
		System.out.println("Length = " + numlist.size());
		
		numlist.add(11);
		numlist.add(12);
		numlist.add(13);
		numlist.add(14);
		numlist.add(15);
		
		System.out.print("Length = " + numlist.size());
		System.out.print(numlist);
		
		System.out.print("\nEnter index to update: ");
		int index_update = scan.nextInt();
		System.out.print("Enter element to update: ");
		int element_update = scan.nextInt();
		
		numlist.set(index_update,element_update);
		System.out.print(numlist);
	
	}

}
