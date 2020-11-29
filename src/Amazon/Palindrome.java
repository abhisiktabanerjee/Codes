package Amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class Palindrome
{
	public static void main(String args[]){
		Node n = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(2);	
		Node n5 = new Node(1);
		n4.next = n5;
		n3.next=n4;
		n2.next=n3;
		n.next=n2;		
		Palindrome p = new Palindrome();
		//p.isPalindrome(n);		
		System.out.println(p.isPalindrome(n));
		
	}
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
    	Node temp = head;
    	boolean result=false;
    	ArrayList<Integer> list= new ArrayList<Integer>();
        while(temp.next!=null){
        	list.add(temp.data);
        	temp =temp.next;
        }
        
       list.add(temp.data);
       
//       list.removeAll(list);
//       ArrayList<Integer> list2= new ArrayList<Integer>
//       (Arrays.asList(1,5,2,4,4,1,2,2,2,1,5,4,5,4,2,1));
//       list.addAll(list2);
       int size = list.size();       
//       if(size==1){
//    	   return true;
//       }
        for(int j=0,k=list.size()-1;j<k;j++,k--){
        	if(list.get(j)==list.get(k)){
        		result=true;
        		continue;
        	}
        	else
        		result=false;
        		return result;
        }
        return true;
    }    
}
