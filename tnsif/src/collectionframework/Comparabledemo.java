package collectionframework;
                                                  // 13-03-2026

import java.util.ArrayList;
import java.util.Collections;

// demo for comparable interface

class Person implements Comparable<Person>{
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	void displayinfo() {
		System.out.println("name "+name );
	}
	@Override
	public int compareTo(Person other) {
		return this.name.compareTo(other.name);
	}
}


public class Comparabledemo {
	public static void main(String[] args) {
		ArrayList<Person> p=new ArrayList<>();
		p.add(new Person("John" ,30));
		p.add(new Person("Anil" ,20));
		p.add(new Person("Basker" ,17));
		
		Collections.sort(p);
		//System.out.println(p);
		for(Person p1:p) {
			p1.displayinfo();
		}
	}
	

}
