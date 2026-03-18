package stringsdemo;

public class Testimmutable {
	public static void main(String[] args) {
String s="sachin";
System.out.println(s);
s=s.concat("tendulkar");
System.out.println(s);
System.out.println(s.length());

System.out.println(s.charAt(3));
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
System.out.println(s.lastIndexOf(s, 0));
}
}