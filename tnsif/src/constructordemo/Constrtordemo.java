package constructordemo;                                                 

import java.util.Scanner;                                                                // 02-03-2026

public class Constrtordemo {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name");
	String Name=sc.next();
	System.out.println("enter the id");
	int id=sc.nextInt();
	System.out.println("enter the address");
	String add=sc.next();
	
	Customer c=new Customer("rashmi",7,"peenya");
//	c.setCustomername(name);
//	c.setCustomerid(id);
//	c.setCustomeraddress(add);
	System.out.println(c);
	
	
	sc.close();
}
}