//Define Employee class with id, name, department, salary and print employee’s salary, id, name, department. 
//Find maximum and minimum salary using max() and min() method in above example


package day1102;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Employee {
    private int id;
    private String name;
    private String dept;
    private double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        // Create a list of employees
        
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "kartk", "manager", 50400.00));
        employees.add(new Employee(102, "kunal", "Finance", 76600.00));
        employees.add(new Employee(103, "krishna", "developer", 84000.00));
        
	

        // Use Stream API to print employee details
        employees.forEach(employee -> {
            System.out.println("Employee ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        });
        
        // finding the minimum salary of employee 
    	Employee pl=employees.stream().min((pro1, pro2)->pro1.salary>pro2.salary?1:-1).get(); 
		System.out.println("\nminimum salary of employee : \nid : "+pl.id+" "+"Name : "+pl.name+" "+"price : "+pl.salary);

        // finding the maximum salary of employee 
		Employee p2=employees.stream().max((pro1, pro2)->pro1.salary>pro2.salary?1:-1).get(); 
		System.out.println("\nmaximum salary of employee : \nid : "+p2.id+" "+"Name : "+p2.name+" "+"price : "+p2.salary);
    }
}
