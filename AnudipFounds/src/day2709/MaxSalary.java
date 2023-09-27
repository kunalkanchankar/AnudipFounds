package day2709;

public class MaxSalary {

	public static void main(String[] args) {
		Employee[] employees = new Employee[5];
        employees[0] = new Employee(1,"kunal",50000);
        employees[1] = new Employee(2,"vivek",650000);
        employees[2] = new Employee(3,"Pratik",55000);
        employees[3] = new Employee(4,"Aman", 70000);
        employees[4] = new Employee(5,"Tarun", 75000);

        double maxSalary = employees[0].getSalary();
        String ename = employees[0].getName();
        
        for (int i = 0; i < employees.length; i++) {
            double currentSalary = employees[i].getSalary();
            if (currentSalary > maxSalary) {
                maxSalary = currentSalary;
                ename = employees[i].getName();
            }
        }

        System.out.println("maximum salary : " + maxSalary);
        System.out.println("Employee name : " + ename);
	}
}

class Employee{
	public
		int id;
		String name;
		double salary;
	public Employee(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public double getSalary() {
	        return salary;
	}
	public String getName() {
        return name;
	}
}


