package collectionframework;

import java.util.LinkedList;
import java.util.List;

public class Linkedlistdemo {
public static void main(String[] args) {
	List<Integer> number=new LinkedList<>();
	//add the data
	number.add(34);
	number.add(34);
	number.add(5);
	number.add(9);
	number.add(null);
	
	System.out.println(number);
	
	number.set(4, 2);
	System.out.println(number);
	
	number.remove(2);
	System.out.println(number);
	
	//get the size of the element
	
	System.out.println(number.size());
	number.clear();
	System.out.println(number);
	
}
}