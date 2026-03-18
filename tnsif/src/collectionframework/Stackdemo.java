package collectionframework;

import java.util.Stack;

//demo for stack
public class Stackdemo {
	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		s.push("A");
		s.push("B");
		s.push("C");
		
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println(s.search("8"));
		
		while(!s.empty()) {
			System.out.println("removed "+s.pop());
		}
		System.out.println("stack after removing all "+s);
	}

}