package javalearning;

class Node1 {
    int value;
    Node1 left, right;

    public Node1(int value) {
        this.value = value;
        left = right = null;
    }
}


public class PreOrder {

	Node1 root;

    void PreOrder(Node1 Node1) {
        if (Node1 == null)
            return;

        System.out.print(Node1.value + " "); //Visit Root
        PreOrder(Node1.left);       // Traverse left subtree
        PreOrder(Node1.right);      // Traverse right subtree
    }

    public static void main(String[] args) {
    	PreOrder tree = new PreOrder();
        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);
        tree.root.right.right = new Node1(6);

        System.out.println("Inorder Traversal:");
        tree.PreOrder(tree.root);
    }
}
