package javalearning;

class Node {
	int value;
	Node left, right;

	public Node(int value) {
		this.value = value;
		left = null;
		right = null;
	}
}

public class Inorder {

	Node root;

	void inorder(Node node) {
		if (node == null)
			return;

		inorder(node.left); // Traverse left subtree
		System.out.print(node.value + " "); // Visit root
		inorder(node.right); // Traverse right subtree
	}

	public static void main(String[] args) {
		Inorder tree = new Inorder();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.right = new Node(6);

		System.out.println("Inorder Traversal:");
		tree.inorder(tree.root);
	}

}

/*
 * 
 * 1 2 3 4 5 na 6
 * 
 */