package lambdaexpressiondemo;
                                        
                                                                      // 11-03-2026
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

// demo for supplier , predicate and consumer
public class SPCDemo {
	
	//Supplier : No input , return value
	public static void main(String[] args) {
	Supplier<String> s=()->"hello from suppiler";
	String suppilervalue=s.get();
	System.out.println(suppilervalue);
	
	//predicate : Takes one input, return boolean value
	
	Predicate<Integer> iseven=number->number%2==0;
	int testnumber=10;
	if(iseven.test(testnumber))
	{
		System.out.println(testnumber +"is even");
	}
	else {
		System.out.println(testnumber +"is odd");
	}
	
	//consumer : Takes one input , return nothing
	
	Consumer<String> c=message ->System.out.println("consumer recieved "+message);
	c.accept("this is test message");
//System.out.println(c);
}
}