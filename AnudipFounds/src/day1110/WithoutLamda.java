package day1110;

interface Printable1{
	public void print();
}

public class WithoutLamda {
	public static void main(String args[]) {
		Printable1 obj = new Printable1() {
			public void print() {
				System.out.println("I m printing important information");
			}
		};
		obj.print();
	}
}
