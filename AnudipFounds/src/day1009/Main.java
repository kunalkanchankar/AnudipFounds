package day1009;

class Calculation {
 void add(int num1, int num2) {
	 System.out.println("Addition Result: " + (num1 +num2));
     
 }
}

class Calculation1 extends Calculation {
  void subtract(int num1, int num2) {
	  System.out.println("Subtraction Result: "+ (num1 -num2));
	     
 }
}

class Calculation2 extends Calculation1 {
 void multiply(int num1, int num2) {
	 System.out.println("Multiplication Result: " + (num1*num2));
 }
}

public class Main {
 public static void main(String[] args) {
     Calculation2 obj = new Calculation2();
     int num1 = 45;int num2 = 7;
     obj.add(num1,num2);
     obj.subtract(num1,num2);
     obj.multiply(num1,num2);
 }
}
