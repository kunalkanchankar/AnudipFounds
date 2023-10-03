package day2909;

public class Enhance {

	public static void main(String[] args) {
		String[][][] color= {{{"red","blue","black"},{"white","pink","lemon"}},{{"red","yellow","green"}}};
		
		for(String[][] x : color ) {
			for(String[] y:x) {
				for(String z:y)
				System.out.println(z);
			}
		}
	}
}
