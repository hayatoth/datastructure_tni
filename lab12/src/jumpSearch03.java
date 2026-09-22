import java.util.ArrayList;
import java.util.Scanner;

public class jumpSearch03 {

    // 1. traversal (ใช้ In-order เพื่อให้ข้อมูลเรียงลำดับจาก น้อย -> มาก)
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

    // 2. jumpSearch
    public static int jumpSearch(int[] nums, int target) {
        int n = nums.length;
        int step = (int) Math.floor(Math.sqrt(n)); // ขนาดของบล็อกกระโดด
        int prev = 0;

        // ค้นหาช่วงบล็อกที่ target น่าจะอยู่
        while (nums[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1; // ถ้ากระโดดเกินขนาด Array
            }
        }

        // ค้นหาแบบ Linear Search ในช่วงบล็อกนั้น
        while (nums[prev] < target) {
            prev++;
            if (prev == Math.min(step, n)) {
                return -1; // ถ้าค้นหาจนสุดบล็อกแล้วยังไม่เจอ
            }
        }

        // ถ้าเจอข้อมูลตรงกับ target
        if (nums[prev] == target) {
            return prev; // คืนค่าตำแหน่ง index ที่พบ
        }

        return -1; // ถ้าไม่พบข้อมูล
    }

    // 3. main
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

        int result = jumpSearch(nums, target);

        if (result != -1) {
            System.out.println("The target (" + target + ") at index " + result);
        } else {
            System.out.println("Cannot found (" + target + ") in this tree");
        }

        scanner.close();
    }
}