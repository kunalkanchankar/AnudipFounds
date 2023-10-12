package day1210;

interface Bank {
	double ROI();
}

class SBI implements Bank {
 @Override
 public double ROI() {
     return 7.5; 
 }
}

class HDFC implements Bank {
 @Override
 public double ROI() {
     return 8.0; 
 }
}

public class BankExample {
 public static void main(String[] args) {
     Bank sbi = new SBI();
     Bank hdfc = new HDFC();

     System.out.println("Rate of Interest (ROI) for SBI: " + sbi.ROI() + "%");
     System.out.println("Rate of Interest (ROI) for HDFC: " + hdfc.ROI() + "%");
 }
}

