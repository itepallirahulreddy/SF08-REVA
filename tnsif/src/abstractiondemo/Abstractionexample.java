package abstractiondemo;

//demo for abstraction
                                                                     //05-06-2026
abstract class payment{
	
	abstract void pay(double amount);
	
	void transactioninfo() {
		System.out.println("payment processing");
	}
}
class Creditcard extends payment{

	@Override
	void pay(double amount) {
		System.out.println("paid "+ amount+" using credit card");
		
	}
}
class UPI extends payment{

	@Override
	void pay(double amount) {
		System.out.println("paid "+amount+ " using upi");
		
	}
	
}

public class Abstractionexample {
public static void main(String[] args) {
	payment p1=new Creditcard();
	p1.pay(500);
	p1.transactioninfo();
	
	payment p2=new UPI();
	p2.pay(5000);
	p2.transactioninfo();
}
}