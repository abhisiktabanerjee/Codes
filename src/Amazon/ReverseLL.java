package Amazon;

import java.util.LinkedList;

public class ReverseLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(5);
		Node n4 = new Node(10);
		n3.next = n4;
		n2.next = n3;
		n.next = n2;
		reverseList(n);

	}
	
	public static Node reverseList(Node head){
		Node temp = head;
		Node next = null;
		Node prev = null;
		while(temp.next!=null){
			next=temp.next;
			temp.next = prev;
			prev=temp;
			temp=next;
		}
		
		return null;
	}

}
