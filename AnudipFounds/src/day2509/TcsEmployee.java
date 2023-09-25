package day2509;
public class TcsEmployee {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"Kunal");
		Employee emp2 = new Employee(102,"Vivek");
		Employee emp3 = new Employee(103,"pratik");
		Employee emp4 = new Employee(104,"samay");
		Employee emp5 = new Employee(105,"aman");
		
		System.out.println("ID : "+emp1.eid+"\nName : "+emp1.ename+"\nCompany : "+emp1.cname);
		System.out.println("ID : "+emp2.eid+"\nName : "+emp2.ename+"\nCompany : "+emp2.cname);
		System.out.println("ID : "+emp3.eid+"\nName : "+emp3.ename+"\nCompany : "+emp3.cname);
		System.out.println("ID : "+emp4.eid+"\nName : "+emp4.ename+"\nCompany : "+emp4.cname);
		System.out.println("ID : "+emp5.eid+"\nName : "+emp5.ename+"\nCompany : "+emp5.cname);
	}

}
class Employee{
	int eid;
	String ename;
	static String cname = "TCS";
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
}