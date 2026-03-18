package polymorphsim;

class RBI{
	int rateOfInterest() {
		return 5;
	}
	void drink() {
		
	}
}
class SBI extends RBI{
	@Override
	int rateOfInterest() {
		return 8;
	}
	
}
public class Methodoverriding {
	public static void main(String[] args) {
SBI s=new SBI();
 s.rateOfInterest();
}
}