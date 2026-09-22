import java.util.ArrayList;
import java.util.Scanner;

public class binarySearch03 {

    public static ArrayList<Integer> traversal(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list;
    }

    private static void inOrder(Node node, ArrayList<Integer> list) {
        if (node != null) {
            inOrder(node.left, list);
            list.add(node.data);
            inOrder(node.right, list);
        }
    }

    // 2. binarySearch
    public static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid; 
            }

            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

   
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.sampleTree();
        tree.printTree(tree.getRoot(), 0);

        ArrayList<Integer> list = traversal(tree.getRoot());
        int[] nums = list.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("\nTraversal order : " + list);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = scanner.nextInt();

        int result = binarySearch(nums, target);

        if (result != -1) {
            System.out.println("The target (" + target + ") at index " + result);
        } else {
            System.out.println("Cannot found (" + target + ") in this tree");
        }

        scanner.close();
    }
}