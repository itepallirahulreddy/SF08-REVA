package streamapidemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamapidemo {
public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	List<Integer> result=numbers.stream()
			             .filter(n->n%2==0)// intermidiate : keep only even numbers
	.map(n->n*2)//multiply even number by 2
	.sorted()//sort the number
	.collect(Collectors.toList());//terminal 
	System.out.println(result);
}
}