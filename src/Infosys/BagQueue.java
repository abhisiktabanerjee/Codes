package Infosys;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BagQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Character> queue = new LinkedList<>();
		queue.add('A');
		queue.add('B');
		queue.add('C');
		queue.add('B');
		queue.add('D');
		queue.add('A');
		queue.add('E');
		queue.add('B');
		queue.add('B');
		queue.add('E');
		System.out.println("Queue before sorting: "+ queue);
		prioritySort(queue, 'B');	
		
	}
	
	public static void prioritySort(Queue<Character> queue,Character ch) {
		Queue<Character> result = new LinkedList<>();
		Iterator<Character> itr =queue.iterator();
		while(itr.hasNext()) {
			Character temp = itr.next();
			if(temp.equals(ch)) {
				result.add(temp);
				itr.remove();
			}
		}
		for(Character c:queue)
			result.add(c);
		
		System.out.println("Queue after sorting :"+ result);
	}

}
