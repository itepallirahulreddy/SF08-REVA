package scannerclassdemo;

import java.util.Scanner;
                                                                                           //02-03-2026
public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		sc.nextInt();
		System.out.println("enter the name");
		sc.nextLine();
		
		sc.close();
	}
	

}