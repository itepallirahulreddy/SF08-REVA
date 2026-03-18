package scannerclassdemo;

import java.util.Scanner;

public class Personexec {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the person name");
		String name=sc.next();
		
		System.out.println("Enter the income");
		int income=sc.nextInt();
		
		Person pp=new Person();
		pp.setName(name);
		pp.setIncome(income);
		
		TaxCalculation t=new TaxCalculation();
		
		t.CalculateTax(pp);
		
		System.out.println("after calculation of tax");
		System.out.println(pp);
		
		
		sc.close();
	}
	
	

}