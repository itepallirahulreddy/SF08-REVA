package exceptionhandling;

//finally with exception
public class Test2 {
	public static void main(String[] args) {
		String str="Reva-TNS";
		try {
		char ch=str.charAt(10);
		}
		catch(ArithmeticException t) {
			System.out.println(t);
		}
		finally {
			System.out.println("java");
		}
		System.out.println("hello java");
	}
}