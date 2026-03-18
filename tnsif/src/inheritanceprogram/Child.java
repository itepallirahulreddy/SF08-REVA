package inheritanceprogram;

public class Child extends Father{                                                // 03-03-2026
	String bicycle="pink";
	int money=90000;
	public static void main(String[] args) {
		Child c=new Child();
		//Father c=new Father();
		System.out.println(c.money);
		System.out.println(c.bicycle);
		c.drinking();
	}
	

}