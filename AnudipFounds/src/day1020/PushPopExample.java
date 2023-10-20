package day1020;

import java.util.Stack;

public class PushPopExample {

	public static void main(String[] args) {
		Stack<String> color = new Stack<>();
		color.push("Red");
		color.push("Blue");
		color.push("Yellow");
		color.push("Green");
		color.pop();
		color.pop();
		color.forEach(s->System.out.println(s));
	}

}
