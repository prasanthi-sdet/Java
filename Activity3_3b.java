package javapractice;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Activity3_3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq = new LinkedList<String>();		 
        
        dq.add("Sai");
        dq.addFirst("Adithya");
        dq.addLast("Chetan");        
        
        dq.offer("Apple");
        dq.offerFirst("Teja");
        dq.offerLast("Orange");
 
        Iterator<String> iterator = dq.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
 
        //Peek at head element
        System.out.println("Peek: " + dq.peekFirst());
        System.out.println("Peek: " + dq.peekLast());
        //To show that the element have not been deleted
        System.out.println("After peek: " + dq);
        
        //Search for element
        System.out.println("Contains Teja?: " + dq.contains("Teja"));
 
        //Remove the first and last element
        dq.removeFirst();
        dq.removeLast();
        System.out.println("dq after removing first and last elements: " + dq);
        System.out.println("Size of deque after removal: " + dq.size());

	}

}
