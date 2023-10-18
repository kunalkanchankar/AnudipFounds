package day1009;

class Human{
	String name;
	String aid;
	public Human(String name, String aid) {
		this.name = name;
		this.aid = aid;
	}
}
class Student extends Human{
	String coursename;
	int marks; 
	public Student (String name, String aid, String coursename, int marks) {
		super(name, aid);
		this.coursename = coursename;
		this.marks = marks;
	}
	public void displayInfo() {
		System.out.println("Student name:  "+name+"\nId : "+aid+"\nCourse name : "+coursename+"\nMarks: "+marks);
	}
}
public class Inher {
	public static void main(String args[]) {
		Student obj = new Student("kunal","emp001","Adv java in Angular",80);
		obj.displayInfo();
	}
}
