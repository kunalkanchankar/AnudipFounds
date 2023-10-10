package day1010;

class Bird{
	public String fly(){
		return "Birds can fly";
	}
}

class Parrot extends Bird{
	public String fly(){
		return "Parrot Can Fly";
	}
}

class Ostrich extends Bird{
	public String fly(){
		return "Ostrich Can't Fly";
	}
}

public class OverridingExample {
	public static void main(String[] args) {

		Bird b;
		b=new Parrot();
		System.out.println(b.fly());

		b=new Ostrich();
		System.out.println(b.fly());

	}

}