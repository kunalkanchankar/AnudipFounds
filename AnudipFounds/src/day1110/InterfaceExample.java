package day1110;


interface Printable{
	public void print();
} 
@FunctionalInterface
interface Showable{
	public void show();
}

public class InterfaceExample implements Printable, Showable {
	public static void main(String[] args) { 
		InterfaceExample obj=new InterfaceExample();
		obj.print();
		obj.show();
	}
	@Override
	public void show() {
		System.out.println("Show me something");
	}
	@Override
	public void print() {
		System.out.println("Please print given data");
	}
}