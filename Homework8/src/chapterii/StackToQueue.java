package chapterii;
//  Write the code that transfers the elements from a stack s to a queue q.
import java.util.*;
public class StackToQueue {

	public static void main(String[] args) {
	
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		Queue<Integer> q = new LinkedList<Integer>();
		
		
		stackToQueue(s, q);
		
		
		
	}
	public static void stackToQueue(Stack<Integer> s, Queue<Integer> q) {
		while(!s.isEmpty()) {
			int n = s.pop();
			q.add(n);
		}
		System.out.println(q);
	}

}
