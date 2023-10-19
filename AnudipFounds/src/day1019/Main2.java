package day1019;

/*
create Bank interface with abstract method of rateOfInterest() 
and its implements by three classes HDFC,ICICI,SBI will 
return diffrent rate of interes calculate 1 year 
simple interest on amount of 1 lakh provided by all three banks.
*/

interface Bank{
	double rateOfInterest();
}
class HDFC implements Bank{
	public double rateOfInterest() {
		return 3.7; 
	}
}
class ICICI implements Bank{
	public double rateOfInterest() {
		return 2.5;
	}
}
class SBI implements Bank{
	public double rateOfInterest() {
		return 1.8;
	}
}

public class Main2 {
	public static void main(String[] args) {
		
		Bank obj1 = new HDFC();
		Bank obj2 = new ICICI();
		Bank obj3 = new SBI();
		int principle = 100000;
		
		System.out.println("Simple Interset of HDFC : " +(principle * obj1.rateOfInterest())/100);
		System.out.println("Simple Interset of ICICI : " +(principle * obj2.rateOfInterest())/100);
		System.out.println("Simple Interset of SBI : " +(principle * obj3.rateOfInterest())/100);
	}

}
