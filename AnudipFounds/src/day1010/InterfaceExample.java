package day1010;

interface Animal1{
	public void animalSound(); 
	public void sleep();
} 

public class InterfaceExample implements Animal1 {
	public static void main(String[] args) { 
		InterfaceExample obj=new InterfaceExample();
		obj.animalSound(); obj.sleep();
	}

	@Override
	public void animalSound() {
		System.out.println("All animals make sound");
	}
	@Override
	public void sleep() {
		System.out.println("ZZZZZZZZZZ");
	}
}