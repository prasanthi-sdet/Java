package javapractice;

import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		
        for (int i=1;i<=5;i++) {
            q.add(i);
        }
 
        System.out.println("Queue values: " + q);
        
        System.out.println("removed element: " + q.remove());
        
        System.out.println("head of queue: " + q.peek());
        
        System.out.println("Size of queue: " + q.size());
        
        System.out.println("Updated Queue values: " + q);
        

	}

}
