package day1210;

import java.util.ArrayList;
import java.util.List;

public class LamdaListArray {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("HELLO");
		list.add("WORLD");
		list.add("WELCOME");
		list.forEach(x->{
			System.out.println(x.toLowerCase());
		});
	}
}

