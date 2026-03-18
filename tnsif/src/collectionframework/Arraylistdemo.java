package collectionframework;

import java.util.ArrayList;

public class Arraylistdemo {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("Apple");
	al.add("Mango");
	al.add("Dragan fruit");
	
	System.out.println(al);
	System.out.println(al.get(2));// access element
	
	al.set(1, "banana");
	System.out.println(al); // modify the data
	
	if(al.contains("Apple")) {
		System.out.println("apple is present");
	}
	System.out.println(al);
	
	for(String fruits:al) {
		System.out.println(fruits);
	}
}
}