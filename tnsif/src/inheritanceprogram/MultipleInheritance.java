package inheritanceprogram;

//parent
class Device{
	void devicetype() {
		System.out.println("iam an electronic device");
	}
}
//child class

class Phone extends Device{
	void brand() {
		System.out.println("samsung");
	}
}
class smartphone extends Phone{
	void fetures() {
		System.out.println("camera , ram");
	}
}


public class MultipleInheritance {
public static void main(String[] args) {
	smartphone s=new smartphone();
	s.brand();
	s.devicetype();
	s.fetures();
}
}