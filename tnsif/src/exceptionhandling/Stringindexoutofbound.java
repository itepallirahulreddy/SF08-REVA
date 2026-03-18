package exceptionhandling;

public class Stringindexoutofbound {
public static void main(String[] args) {
	String str="Reva-TNS";
	try {
	char ch=str.charAt(10);
	}
	catch(Exception t) {
		System.out.println(t);
	}
	
	finally {
		System.out.println("good");
	}
	System.out.println("jav");
}
}
