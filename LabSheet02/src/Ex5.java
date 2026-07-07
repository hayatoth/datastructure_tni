
public class Ex5 {

	public static void main(String[] args) {
		NumArrayController nums = new NumArrayController();
		nums.display("Display an initail dataset: ");
		
		int[] copy_nums = new int [nums.getSize() - 1];
		for (int i=0; i<copy_nums.length; i++) {
			copy_nums[i] =nums.getNumArray()[i];
			
		}
		nums.setNumbers(copy_nums);
		nums.display("\n\nAdter deleted the first element: ");	

	}

}
