package exceptionhandling;

public class Nullpointerexception {
public static void main(String[] args) {
	String str=null;
	try {
	System.out.println(str.length());
	System.out.println("welcome");
	}
	
	catch(ArithmeticException d) {
		System.out.println(d);
	}
//	catch(NullPointerException n) {
//		System.out.println("hello exception");	
//	}
	catch(Exception g) {
		System.out.println("hello java");
	}
	
	System.out.println("hello world");
}
}