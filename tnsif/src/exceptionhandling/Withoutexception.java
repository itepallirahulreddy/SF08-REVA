package exceptionhandling;

	public class Withoutexception {
		public static void main(String[] args) {
			int a=10;
			int b=20;
			try {
			int c=a/0;// risky code
			System.out.println("hello reva");
			}
			catch(ArithmeticException e) {  // handling senarios 
				System.out.println(e.getMessage());
			}
			System.out.println("welcome to java");
		}
		}


