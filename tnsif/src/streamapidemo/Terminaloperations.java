package streamapidemo;

//demo for terminal operations

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Terminaloperations {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(3,6,8,3,9,1,7);
		
		//foreach- print the each number
		numbers.stream().forEach(n->System.out.println(n+" "));
		
		// toarray - convert stream to array
		
		Integer[] array= numbers.stream().toArray(Integer[]::new);
		System.out.println(Arrays.toString(array));
		
		// reduce - sum of all numbers
		
		int sum1=numbers.stream().reduce(0, Integer::sum);
		System.out.println(sum1);
		
		// max()- find the max number
		
		Optional<Integer> max1=numbers.stream().max(Integer::compareTo);
		max1.ifPresent(value->System.out.println(value));
		
		Optional<Integer> min=numbers.stream().min(Integer::compareTo);
		min.ifPresent(value->System.out.println(value));
		
	}

}