package Amazon;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String args[]) {

		Node n5 = new Node(30);
		Node n6 = new Node(40);
		Node n7 = new Node(50);
		Node n8 = new Node(60);
		Node n9 = new Node(70);

		n8.next = n9;
		n7.next = n8;
		n6.next = n7;
		n5.next = n6;
		
		System.out.println(removeDuplicates(n5));
	}

	static Node removeDuplicates(Node root) {
		// Your code here
		Node temp = root;
		Node result;
		Set<Integer> s = new LinkedHashSet<>();

		while (temp != null) {
			s.add(temp.data);
			temp = temp.next;
		}
		temp = root;
		while (temp.next != null) {
			if (s.contains(temp.data)) {
				s.remove(temp.data);
				temp = temp.next;
				continue;
			} else {
				temp.next = temp.next.next;
				temp = temp.next;
			}
		}
		return temp;

	}
}
