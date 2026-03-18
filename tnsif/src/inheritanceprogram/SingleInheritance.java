package inheritanceprogram;

//parent
class Course{
	String coursename="java programming";
	
	void showcourse() {
		System.out.println("course "+coursename);
	}
}
//child class

class Student extends Course{
	String Studentname="amit";
	void showstudent() {
		System.out.println("student "+Studentname);
	}
}

public class SingleInheritance {
public static void main(String[] args) {
	Student s=new Student();
	s.showcourse();
	s.showstudent();
}
}