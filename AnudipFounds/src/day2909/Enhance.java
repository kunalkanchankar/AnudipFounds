package day2909;

public class Enhance {

	public static void main(String[] args) {
		String[][] color= {{"red","blue","black"},{"white","pink","lemon"}};
		
		for(String[] x : color ) {
			for(String y:x) {
				System.out.println(y);
			}
		}
 
	}

}
