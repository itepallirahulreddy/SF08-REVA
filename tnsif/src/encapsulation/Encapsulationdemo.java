package encapsulation;

public class Encapsulationdemo {                                       // 27-02-2026
	int serialnumber;  // data member                                      
	String name;
	int age;
	
	void show() {    // member
		System.out.println(serialnumber +" "+name+" "+age);
	}
	public static void main(String[] args) {
		Encapsulationdemo e=new Encapsulationdemo();
		e.serialnumber=1;
		e.name="rahul";
		e.age=25;
		
		e.show();
	}
	

}