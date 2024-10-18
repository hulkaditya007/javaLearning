package NodeQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node{
	int val;
	Node next;
	
	public Node(int val) {
		this.val = val;
	}
}

public class AssendingList {

	public static void main(String[] args) {
		Node node = new Node(-1);
		node.next = new Node(5);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(2);
		node.next.next.next.next.next = new Node(0);
		
		Node sizeNode = node;
		int size = 0;
		while(sizeNode!=null) {
		  size++;
		  sizeNode = sizeNode.next;
		}
		
		List<Integer> li = new ArrayList<>();
        while(node!=null) {
        	li.add(node.val);
        	node = node.next;
        }
        
        Collections.sort(li);
        
        if(li.size()>0) {
        	Node newNode = new Node(li.get(0));
        	Node tempNode = newNode;
        	for(int i=1;i<size;i++) {
        		Node n = new Node(li.get(i));
        		newNode.next = n;
        		newNode = newNode.next;
        	}
        	
        	while(tempNode!=null) {
        		System.out.println(tempNode.val);
        		tempNode = tempNode.next;
        	}
        }
        
        
        
        	
	}

}
