package day1019;


class Container<T>{
	T value;
	public void show() {
		System.out.println(value.getClass().getName());
	}
}
public class Generic {
 public static void main(String args[]) {
	Container<Integer> obj1 = new Container(); 
	Container<String> obj2 = new Container(); 
	obj1.value = 10;
	obj2.value = "sd";
	obj1.show();
	obj2.show();
 }
}
