package polymorphsim;

class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	int add(int a, int b,int c) {
		return a+b+c;
	}
}

public class Methodoverloading {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.add(2, 8));
		System.out.println(c.add(7.5, 3.2));
		System.out.println(c.add(1, 2, 3));
	}

}