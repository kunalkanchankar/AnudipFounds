package day1010;


abstract class Animal{
	public abstract void animalSound(); 
	public void sleep() {
		System.out.println("Sleeping ZZZZ");
	}
}
public class AbstractionExample extends Animal {
	public static void main(String[] args) { 
		AbstractionExample obj=new AbstractionExample(); 
		obj.animalSound();
	}
	
	@Override
	public void animalSound() { 
		System.out.println("Animal makes sound");
	}
}