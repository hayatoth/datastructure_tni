
public class BSTApp1 {

	public static void main(String[] args) {
		
		
		BinarySearchTree tree = new BinarySearchTree ();
		tree.sampleTree1();
		tree.printTree(tree.getRoot(),0);
		
		
		//no.3
        System.out.println("Minimum Node is " + tree.findMinimum(tree.getRoot()).data);
        System.out.println("Minimum Node is " + tree.findMaximum(tree.getRoot()).data);
        
        //no.5
        int target = 40;
        System.out.println( "is 40 BST => " + tree.findSpecificData(target)); 
	
		//no.7
        int delNode = 60;
       
        tree.searchDeleteNode(delNode);
        System.out.println("Delete Node is = " + tree.getDeleteNode().data);

	}

}
