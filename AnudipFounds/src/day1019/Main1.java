package day1019;

/*Creating one superclass Hill stations and three subclasses Manali, Mussoorie, Gulmarg. 
Subclasses extend the superclass and override its location() and famousfor() method. 
We will call the location() and famousfor() method by the Parent class’, i.e. Hillstations class. 
As it refers to the base class object and the base class method 
overrides the superclass method; the base class method is invoked at runtime. 
*/

class HillStation{
	void location(){
		System.out.println("Loacation is Hill Station");
	}
	void famousfor() {
		System.out.println("Famous for nature");
	}
}
class Manali extends HillStation{
	void location(){
		System.out.println("Loacation is Manali");
	}
	void famousfor() {
		System.out.println("Famous for nature and mountians");		
	}
}
class Mussoorie extends HillStation{
	void location(){
		System.out.println("Loacation is Mussoorie");
	}
	void famousfor() {
		System.out.println("Famous for nature and love");
	}
}
class Gulmarg extends HillStation{
	void location(){
		System.out.println("Loacation is Hill Gulmarg ");
	}
	void famousfor() {
		System.out.println("Famous for nature");
	}
}

public class Main1 {
	public static void main(String[] args) {
		Manali obj1 = new Manali();
        Mussoorie obj2 = new Mussoorie();
        Gulmarg obj3 = new Gulmarg();
        HillStation obj4 = new HillStation();
        obj1.location(); obj1.famousfor();
        obj2.location(); obj2.famousfor();
        obj3.location(); obj3.famousfor();
        obj4.location(); obj4.famousfor();
	}
}
