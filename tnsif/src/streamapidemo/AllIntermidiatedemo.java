package streamapidemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// demo for intermediate operation
public class AllIntermidiatedemo {
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,9,9,1,11,21,32,45);
	// map() : multiple each number by 2
		
		List<Integer> d=numbers.stream().map(n->n*2).collect(Collectors.toList());
		System.out.println(d);
		
		// distinct() - remove duplicates
		List<Integer> e=numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(e);
		
		//Sorted()
		List<Integer> s=numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(s);
		
		
		// limit()- take only first 5 elements
		List<Integer> l=numbers.stream().limit(5).collect(Collectors.toList());
		System.out.println(l);	
		
		// skip() - skip the 5 number
		List<Integer> t=numbers.stream().skip(5).collect(Collectors.toList());
		System.out.println(t);	
		
	}

}