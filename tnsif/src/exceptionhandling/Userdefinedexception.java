package exceptionhandling;

public class Userdefinedexception {
	public static void main(String[] args) {
		int age=5;
		
		if(age<18) {
			throw new ArithmeticException("you are not eligiable to vote");
		}
		else {
			System.out.println("you are eligiable to vote");
		}
	}
}
