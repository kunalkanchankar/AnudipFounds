package day1031;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main2 {
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
	    students.add(new Student(104, "Vivek", 87));
	    students.add(new Student(102, "Sejal", 67));
	    students.add(new Student(101, "Rekha", 77));
	    students.add(new Student(103, "Isha", 57));
		List<Double> newstudent = students.stream().filter(p->p.marks>70).map(p->p.marks).collect(Collectors.toList());
		System.out.println(newstudent);
		
		Student pl=students.stream().max((pro1, pro2)->pro1.marks>pro2.marks?1:-1).get(); 
		System.out.println("id : "+pl.id+" "+"Name : "+pl.name+" "+"price : "+pl.marks);
		
	}
}

class Student {
 int id;
 String name;
 double marks;

 public Student(int id, String name, double marks) {
     this.id = id;
     this.name = name;
     this.marks = marks;
 }
}
