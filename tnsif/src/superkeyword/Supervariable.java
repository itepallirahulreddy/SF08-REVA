package superkeyword;

//parent class
class Notification{                                                     // 03-0-2026
	String message="default notification";
}

//child class
class Pushnotification extends Notification{
	String message="push notification";
	
	void shownotification() {
		System.out.println("child message "+message);
		System.out.println("parent message "+super.message);
	}
}

public class Supervariable {
public static void main(String[] args) {
	Pushnotification p=new Pushnotification();
	p.shownotification();
}
}