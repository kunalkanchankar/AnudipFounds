package day1012;

class Employee {
    private String name;
    private int yearOfJoining;
    private String address;

    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println(name + "\t" + yearOfJoining + "\t" + address);
    }
}

public class EmployeesInfo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 2014, "64C- WallsStreat");
        Employee employee2 = new Employee("Sam", 2015, "68D- WallsStreat");
        Employee employee3 = new Employee("John", 2009, "26B- WallsStreat");

        System.out.println("Name\tYear of joining\tAddress");
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}

