import java.util.ArrayList;
import java.util.Scanner;

public class linearSearch03 {

    public static ArrayList<Integer> traversal(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }

    private static void preOrder(Node node, ArrayList<Integer> list) {
        if (node != null) {
            list.add(node.data);
            preOrder(node.left, list);
            preOrder(node.right, list);
        }
    }

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i; 
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

        int result = linearSearch(nums, target);

        if (result != -1) {
            System.out.println("The target (" + target + ") at index " + result);
        } else {
            System.out.println("Cannot found (" + target + ") in this tree");
        }

        scanner.close();
    }
}