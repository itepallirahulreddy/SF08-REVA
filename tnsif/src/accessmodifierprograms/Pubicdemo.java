package accessmodifierprograms;

public class Pubicdemo {
	 int a=9;   // variables
	//private String f="Rahul";
	protected int d=9;
	
	
	public void display() { // method
		System.out.println("welcome to java");
	}
	public static void main(String[] args) {
		Pubicdemo b=new Pubicdemo(); // object creation	
		
		System.out.println(b.a);
		System.out.println(b.d);
		//System.out.println(b.f);
	}
	
	

}