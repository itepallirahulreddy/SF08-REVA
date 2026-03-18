package exceptionhandling;

//finally - without exception
public class Test1 {
	public static void main(String[] args) {
		try {
			System.out.println("hello java");
		}
		catch(Exception h) {
			System.out.println("hi");
		}
		finally {
			System.out.println("hello students");
		}
	}

}