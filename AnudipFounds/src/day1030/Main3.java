package day1030;

import java.util.Arrays;
import java.util.List; import java.util.Set;
import java.util.stream.Collectors;
public class Main3 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,5,7,8,9,2);
		List<Integer> square = numbers.stream().map(x->x*x).collect (Collectors.toList()); 
		square.forEach(x->System.out.print(x+" "));
	}
}

//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Collectors;
//
//public class Main3 {
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(4, 16, 49, 36, 9, 2);
//        List<Double> squareRoots = numbers.stream()
//                .map(x -> Math.sqrt(x))
//                .collect(Collectors.toList());
//
//        squareRoots.forEach(x -> System.out.print(x + " "));
//    }
//}
