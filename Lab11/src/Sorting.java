import java.util.ArrayDeque;
import java.util.Deque;

public class Sorting {
	private int[] array;
	
	public Sorting(int[]array) {
		this.array= array;
	}
	
	public void prinSortedData() {
		for (int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
	public void bubbleSort() {
		for(int i=0; i<array.length; i++) {
			boolean is_swapped = false;
			for (int j=0; j<array.length-i-1; j++) {
				int current_index = j;
				if (array[current_index] > array[current_index+1]) {
					int temp = array[current_index];
					array[current_index] = array[current_index+1];
					array[current_index+1] = temp;
					
					is_swapped = true; 
				}
			}
			if (is_swapped == false) {
				break;
			}
		}
	}
	public void bubbleSort(boolean order) {
		for(int i=0; i < array.length; i++) {
			boolean is_swapped = false;
			for (int j=0; j<array.length-i -1; j++) {
				if (order== true) {
				if (array[j] < array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
					is_swapped = true; 
				}
			}
			}
			if (is_swapped == false) {
				break;
			}
		}
	}
	public void selectionSort () {
		for (int i = 0; i < array.length; i++) {
			int minimum_index = i;
			for (int j = i; j < array.length; j++) {
				if(array[j] < array[minimum_index]) {
					minimum_index = j;
				}
			}
			int temp = array[i];
			array[i] = array[minimum_index];
			array[minimum_index] = temp;
		}
		
	}
	public void insertionSort() {
		for (int i = 1; i < array.length;  i++) {
			int key = array[i];
			int walker_index = i-1;
			while (walker_index >= 0 && array[walker_index] > key) {
				array[walker_index +1] = array[walker_index];
			    walker_index = walker_index-1; //walker_index--;
			}
			array[walker_index+1] = key;
		}
	}
	public void quicksort() {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(array.length - 1);
		stack.push(0);
		while (!stack.isEmpty()) {

	        int low = stack.pop();
	        int high = stack.pop();
	        if (high - low < 1) {
	           continue;
	            }
	        int j =partition(low , high);
	        stack.push(high);
	        stack.push(j+1);
	        stack.push(j);
	        stack.push(low);
	        }
	    }
	
	private int partition(int low, int hight) {
		
		int pivot = array[low];
		int i = low ; 
		int j = hight;
		while (true) {
			while (array[i] < pivot) {
				i++;
				
			}
			while (array[j] > pivot) {
				j--;
				
			}
			if (i>=j) {
				break;
			}
			int temp = array[i];
			array[i]= array[j];
			array[j]= temp;
			i++;
			j--;
			
	}
		return j;
	}
}