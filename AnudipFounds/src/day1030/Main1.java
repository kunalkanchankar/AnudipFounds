package day1030;


import java.util.*;

public class Main1 {
	
	public static void main(String[] args) { 
		ArrayList<Student> s = new ArrayList<>(); 
		s.add(new Student (102, "Shital",87)); 
		s.add(new Student (103, "Sakshi",67)); 
		s.add(new Student (104, "Purva",77)); 
		s.add(new Student (101, "Pari",82)); 
		s.add(new Student (105,"Anita",72));
		
		System.out.println("Before sorting: "); 
		
		s.forEach(x-> System.out.println(x.id+" "+x.name+" "+x.marks)); 
		Collections.sort(s); 
		System.out.println("After sorting: "); 
		s.forEach(x-> System.out.println(x.id+" "+x.name+" "+x.marks)); 
	}
}


class Student implements Comparable<Student>{
	
	int id;	
	String name;
	int marks; 
	
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;	
		this.marks = marks;
	}

	public int compareTo(Student o) { 
		if (this.marks>o.marks) {
			return 1;
		}
		else if (this.marks < o.marks) {
			return -1;
		}
	    else{
	    	return 0;
	    }
	
	}
}