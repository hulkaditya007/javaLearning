package javalearning;

class Node2 {
    int value;
    Node2 left, right;

    public Node2(int value) {
        this.value = value;
        left = right = null;
    }
}



public class PostOrder {


	Node2 root;

    void postOrder(Node2 Node2) {
        if (Node2 == null)
            return;

        
        postOrder(Node2.left);       // Traverse left subtree
        postOrder(Node2.right);      // Traverse right subtree
        System.out.print(Node2.value + " "); //Visit Root
    }

    public static void main(String[] args) {
    	PostOrder tree = new PostOrder();
        tree.root = new Node2(1);
        tree.root.left = new Node2(2);
        tree.root.right = new Node2(3);
        tree.root.left.left = new Node2(4);
        tree.root.left.right = new Node2(5);
        tree.root.right.right = new Node2(6);

        System.out.println("Inorder Traversal:");
        tree.postOrder(tree.root);
    }

}
