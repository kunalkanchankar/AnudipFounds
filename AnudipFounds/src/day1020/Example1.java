package day1020;

import java.util.ArrayList;

public class Example1 {
	public static void main(String args[]) {
		ArrayList<Integer> num = new ArrayList<>(); 
		num.add(20);
		num.add(10);
		num.add(5);
		num.add(15);
		num.add(23);
		num.add(40);
//		num.forEach(x->System.out.println(x));
		num.sort(null);
		num.forEach(x->System.out.println(x));
		
		ArrayList<String> str = new ArrayList<>(); 
		str.add("good");
		str.add("to");
		str.add("see");
		str.add("you");
		str.add("all");
//		str.forEach(x->System.out.println(x));
		str.sort(null);
		str.forEach(x->System.out.println(x));
	}
}
