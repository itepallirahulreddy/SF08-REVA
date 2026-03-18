package polymorphsim;

class Student{                           // 04-03-2026
	String name;                                                           
	int age;
	
	Student(){
		System.out.println("default constructor");
	}
	Student(String name){
		this.name=name;
		System.out.println(name);
	}
	Student(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println(name +" "+age);
		
	}
}

public class Constructoroverload {
public static void main(String[] args) {
	Student s1=new Student();
	Student s2=new Student("aliya");
	Student s3=new Student("bob",8);
	
}
}