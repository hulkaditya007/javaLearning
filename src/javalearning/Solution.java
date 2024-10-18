package javalearning;

import java.util.ArrayList;
import java.util.List;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class Solution {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		 node.next = new ListNode(2); 
		 node.next.next = new ListNode(3); 
		 node.next.next.next = new ListNode(4);
		 node.next.next.next.next = new ListNode(5);
			 
		 
		removeNthFromEnd(node, 2);
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode sizeNode = head;
		int size = 0;
		while (sizeNode != null) {
			sizeNode = sizeNode.next;
			size++;
		}

		int delNode = size - n;
		int trav = 0;
		ListNode startNode = head;
		ListNode prevNode = null;
		while (head != null) {
			if (delNode == 0 && prevNode == null && head.next == null) {
				startNode = null;
				break;
			}else if(trav == delNode && prevNode ==null) {
				startNode = head.next;
				break;
			}
			else if (trav == delNode) {
				prevNode.next = head.next;
			} else {
				prevNode = head;
				head = head.next;
			}
			trav++;
		}
		while (startNode != null) {
			System.out.println(startNode.val);
			startNode = startNode.next;
		}
		System.out.println("Success");
		return startNode;

	}

}
