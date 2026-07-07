
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 23, 67, 8, 91, 45, 12, 78 };
		
		System.out.println("Length = " + nums.length);
		System.out.println("First element = " +  nums [0]);
		System.out.println("Last element = " +  nums [nums.length-1]);
		System.out.println("middle element = " +  nums [nums.length/2]);
        
		System.out.println("Display all elements: ");
        for (int i=0; i<nums.length; i++) {
        	if (i != 0) {
        	System.out.print(", ");
        	}
        	System.out.println(nums[i]);
        	

        }
	}

}
