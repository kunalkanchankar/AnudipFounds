package day1810;


public class GetterSetter {

	public static void main(String[] args) {
		Employee obj = new Employee(100, "Jai", 24000);
		System.out.println("Employee ID: " + obj.getEmp_id() + " Employee name: " + obj.getEmp_name()
				+ " Employee salary: " + obj.getEmp_salary());
		Employee obj1 = new Employee(102, "JMoon", 29000);
		System.out.println("Employee ID: " + obj1.getEmp_id() + " Employee name: " + obj1.getEmp_name()
		+ " Employee salary: " + obj1.getEmp_salary());
	}

}
class Employee {
	private int emp_id;
	private String emp_name;
	private double emp_salary;

	public Employee(int emp_id, String emp_name, double emp_salary) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		if (emp_salary > 10000)
			this.emp_salary = emp_salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}
}