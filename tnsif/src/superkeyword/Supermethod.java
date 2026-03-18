package superkeyword;

//demo for super method

class Payment1{
	void process() {
		System.out.println("process payment using gateway..");
	}
}
class GPay extends Payment1{
	void process() {
		System.out.println("process payment using Gpay..");
	}
	
	void complete() {
		super.process();
		process();
	}
}
public class Supermethod {
public static void main(String[] args) {
	GPay g=new GPay();
	g.complete();
}
}