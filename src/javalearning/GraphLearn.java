package javalearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Node {
	int nodeid;
	Node parentNode;
	List<Node> listnodes = null;

	public Node(int nodeid) {
		this.nodeid = nodeid;
	}

	public Node(int nodeid, Node parentNode) {
		this.nodeid = nodeid;
		this.parentNode = parentNode;
	}

}

public class GraphLearn {

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2, node1);
		Node node3 = new Node(3, node1);
		Node node4 = new Node(4, node2);
		Node node5 = new Node(5, node3);
		Node node6 = new Node(6, node1);
		Node node7 = new Node(7, node5);

		List<Node> nodes = Arrays.asList(node1, node2, node3, node4, node5, node6, node7);

		for (Node node : nodes) {
			if (node.parentNode != null) {
				Node pNode = node.parentNode;
				if(pNode.listnodes == null) {
					List<Node> liNode = new ArrayList<>();
					liNode.add(node);
					pNode.listnodes = liNode;
				}else {
					List<Node> lNodes = pNode.listnodes;
					lNodes.add(node);
				}
			}
		}

		for (Node node : nodes) {
			printValues(node,"p");
			System.out.println();
		}

	}
	
	public static void printValues(Node node,String pc) {
		System.out.print(pc+"-"+node.nodeid +"->");
		if(node.listnodes==null) {
			return;
		}
		else {
			for(Node cNode: node.listnodes) {
				String newPc = pc+"c";
				printValues(cNode,newPc);
			}
		}
	}

}
