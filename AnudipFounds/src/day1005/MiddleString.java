package day1005;

//Write a Java method to display the middle character of a string.
public class MiddleString {

	public static void main(String[] args) {
		String sen = "AnudipFoundation";
		int len = sen.length();
		int mid = len/2;
		System.out.println("Middle character of a string is : "+sen.charAt(mid));
	}
}
