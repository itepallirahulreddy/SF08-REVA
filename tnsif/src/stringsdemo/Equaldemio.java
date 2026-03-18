package stringsdemo;

//demo for equals method
public class Equaldemio {
	public static void main(String[] args) {
		
	String s1="rashmi";
	String s2="Rashmi";
	
	String s3=new String("rashmi");
	String s4="rahul";
	
//	System.out.println(s1.equals(s4));
//	System.out.println(s1.equals(s2));
//	System.out.println(s1.equals(s3));
	
	System.out.println(s1.equalsIgnoreCase(s4));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.equalsIgnoreCase(s3));
	
	}	

}