package Amazon;

import java.util.HashSet;
import java.util.Set;

class Intersect {

	public static void main(String args[]) {

		Intersect i = new Intersect();
		Node n = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(5);
		Node n4 = new Node(10);
		n3.next = n4;
		n2.next = n3;
		n.next = n2;

		Node n5 = new Node(30);
		Node n6 = new Node(40);
		Node n7 = new Node(50);
		Node n8 = new Node(5);
		Node n9 = new Node(10);

		n8.next = n9;
		n7.next = n8;
		n6.next = n7;
		n5.next = n6;
		i.intersectPoint(n, n5);
	}

	int intersectPoint(Node headA, Node headB) {
		Node temp = headA;
		Node temp2 = headB;
		int value = 0;
		Set s = new HashSet<>();
		s.add(5);
		s.add(5);
		s.add(5);
		s.add(5);
		s.add(5);
		

		while (temp.next != null && temp2.next != null) {
			if (!(temp == temp2))
				continue;
			else {
				value = temp.data;
				break;
			}
		}

		return value;
	}
}
