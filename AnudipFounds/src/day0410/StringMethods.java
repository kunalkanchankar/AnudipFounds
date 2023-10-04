package day0410;

public class StringMethods {

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.insert();
		obj.replace();

	}

}
class Demo{
	void insert() {
		
	}
	void replace() {
		StringBuffer sb = new StringBuffer("TechVidvanJava");
		sb.replace(4,10, "Project");
		System.out.println(sb);	
	}
}
