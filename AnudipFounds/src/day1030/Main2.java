package day1030;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        
        students.add(new Student(104, "Vivek", 87));
        students.add(new Student(102, "Sejal", 67));
        students.add(new Student(101, "Rekha", 77));
        students.add(new Student(103, "Isha", 57));

        Collections.sort(students, new IdComparator());
        System.out.println("Sorted by ID:");
        students.forEach(s -> System.out.println(s.id + " " + s.name + " " + s.marks));

        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by Name:");
        students.forEach(s -> System.out.println(s.id + " " + s.name + " " + s.marks));
    }
}

class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class IdComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.id > s2.id) {
            return 1;
        } else if (s1.id < s2.id) {
            return -1;
        } else {
            return 0;
        }
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
