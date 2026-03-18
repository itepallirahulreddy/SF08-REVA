package collectionframework;

//demo for comparator interface

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person1{
	String name;
	int age;
	
	Person1(String name, int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("name "+name +" age "+age);
	}
}
//sort by name
class Namecompartor implements Comparator<Person1>{

	@Override
	public int compare(Person1 o1, Person1 o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}
//sort by age

class AgeComparator implements Comparator<Person1>{

	@Override
	public int compare(Person1 o1, Person1 o2) {
		
		return Integer.compare(o1.age, o2.age);
	}
	
}

public class ComparatorDemo {
	public static void main(String[] args) {
		List<Person1> p=new ArrayList<>();
		p.add(new Person1("John" ,30));
		p.add(new Person1("Anil" ,20));
		p.add(new Person1("Baskar" ,10));
		
		Collections.sort(p, new Namecompartor());
		System.out.println("sorted by name");
		for(Person1 f:p) {
			f.display();
		}
		System.out.println();
		
		//sort by age
		Collections.sort(p, new AgeComparator());
		System.out.println("sorted by age");
		for(Person1 f:p) {
			f.display();
		}
		
	}

}