package collectionframework;

import java.util.Collections;
import java.util.Vector;

// demo for vector
public class Vectordemo {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(80);
		v.add(50);
		
		System.out.println(v);
		
		v.insertElementAt(67, 4);
		System.out.println(v);
		
		v.removeElementAt(2);
		System.out.println(v);
		
		Collections.reverse(v);
		System.out.println(v);
		
		System.out.println(v.indexOf(10));
	}

}