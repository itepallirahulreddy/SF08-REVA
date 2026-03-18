package stringsdemo;

//demo for compareto method                             // 10-03-2026
public class CompareTo {
	public static void main(String[] args) {
		String s1="sachin";
		String s2="sachin";
		String s3="ratan";
		
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s3.compareTo(s1));
	}

}