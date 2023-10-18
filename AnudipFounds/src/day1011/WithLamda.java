package day1011;


interface Printable2{
	public void print();
//	public String print();
}

public class WithLamda {
	public static void main(String args[]) {
		Printable2 obj=() -> System.out.println("I m printing important information");
		
//		Printable2 obj1=() -> {
//			return "I m printing important information";
//		};
		
	}
}
