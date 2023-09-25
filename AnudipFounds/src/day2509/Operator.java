package day2509;

public class Operator {
	public static void main(String[] args) {
		UnaryOperator obj = new UnaryOperator();
		obj.Unaop();
	}
}
class UnaryOperator{
	void Unaop() {
		int a = 10;
		int b = 10;
		System.out.println(a++ + ++a);
		System.out.println(b++ + b++);
	}
}
