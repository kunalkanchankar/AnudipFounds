package day1009;



class Human{
	String name;
	String aid;
	public Human(String name, String aid) {
		this.name = name;
		this.aid = aid;
	}
}
class Student1 extends Human{
	String coursename;
	int marks; 
	public Student1 (String name, String aid, String coursename, int marks) {
		super(name, aid);
		this.coursename = coursename;
		this.marks = marks;
	}
	public void displayInfo() {
		System.out.println("Student name:  "+name+"\nId : "+aid+"\nCourse name : "+coursename+"\nMarks: "+marks);
	}
}
public class StudentArray {
	public static void main(String args[]) {
		Student1[] obj = new Student1[5];
		obj[0]=new Student1("kunal","emp001","Adv java in Angular",80);
		obj[1]=new Student1("aniket","emp002","Adv java in Angular",70);
		obj[2]=new Student1("vivek","emp003","Adv java in Angular",75);
		obj[3]=new Student1("pratik","emp004","Adv java in Angular",85);
		obj[4]=new Student1("tarun","emp006","Adv java in Angular",84);
		for(int i=0;i<5;i++) {
		obj[i].displayInfo();
		}
	}
}
