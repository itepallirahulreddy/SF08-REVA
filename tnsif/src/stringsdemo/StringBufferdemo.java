package stringsdemo;

public class StringBufferdemo {
	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("welcome");
		System.out.println(b);;
		b.append(" to java");
		System.out.println(b);
		
		b.insert(3, "hi");
		System.out.println(b);
		b.replace(3, 5, "word");
		System.out.println(b);
		
		b.delete(3, 7);
		System.out.println(b);
		
		b.reverse();
		System.out.println(b);
	}

}