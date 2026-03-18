package scannerclassdemo;

public class TaxCalculation {
	
public void CalculateTax(Person p) {
	
	if(p.getIncome()<=2000) {
		p.setTax(5);
	}
	else if(p.getIncome()>2000 && p.getIncome()<=50000) {
		p.setTax(10);
	}
	else {
		p.setTax(15);
	}
}
}