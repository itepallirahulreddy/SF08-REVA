package streamapidemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// demo for without stream api

public class Withoutstreamapi {
	public static void main(String[] args) {
		//original list of numbers
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		// list to hold the results
		
		List<Integer> result=new ArrayList<>();
		// iterate over each number in the original list
		
		for(Integer number:numbers) {
			//check if the number is even
			if(number %2==0) {
				//multiply by 2
				
				int doubled=number*2;
			
				result.add(doubled);
			}
			System.out.println("doubled the even number "+result);
		}
	}

}