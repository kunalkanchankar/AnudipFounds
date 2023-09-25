package day2509;
public class TcsEmployee {
	public static void main(String[] args) {
		Programmer emp1 = new Programmer(101,"Kunal",520000,5000);
		Programmer emp2 = new Programmer(102,"Vivek",600000,4600);
		Programmer emp3 = new Programmer(103,"pratik",520000,5500);
		Programmer emp4 = new Programmer(104,"samay",570000,6000);
		Programmer emp5 = new Programmer(105,"aman",510000,4000);
		
		System.out.println("ID : "+emp1.eid+"\nName : "+emp1.ename+"\nCompany : "+emp1.cname+"Bonus : "+emp1.bonus);
		System.out.println("ID : "+emp2.eid+"\nName : "+emp2.ename+"\nCompany : "+emp2.cname);
		System.out.println("ID : "+emp3.eid+"\nName : "+emp3.ename+"\nCompany : "+emp3.cname);
		System.out.println("ID : "+emp4.eid+"\nName : "+emp4.ename+"\nCompany : "+emp4.cname);
		System.out.println("ID : "+emp5.eid+"\nName : "+emp5.ename+"\nCompany : "+emp5.cname);
	}

}
class Employee{
	int eid;
	String ename;
	float salary;
	static String cname = "TCS";
	public Employee(int eid, String ename, float salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
}
class Programmer extends Employee{
	int bonus;
	public Programmer(int eid, String ename, float salary,int bonus) {
		super(eid,ename,salary,bonus);
	}
}