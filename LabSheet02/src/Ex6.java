
public class Ex6 {

	public static void main(String[] args) {
		NumArrayController nums = new NumArrayController();
		nums.display("Display an initail dataset: ");
		
		int[] copy_nums = new int [nums.getSize() -1];
		//copy nums index 0-1 to copy_num index 0-1
		for (int i=0; i<2; i++) {
			copy_nums[i] =nums.getNumArray()[i];
			
		}
		for(int i=2+1; i<nums.getSize(); i++) {
			copy_nums[i-1]= nums.getNumArray()[i];
		}
		nums.setNumbers(copy_nums);
		nums.display("\n\nAdter deleted deta in index 2: ");	

	}

}
