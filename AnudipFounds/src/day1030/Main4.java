package day1030;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> my_list = new ArrayList<>();
        my_list.add(12);
        my_list.add(65);
        my_list.add(54);
        my_list.add(39);
        my_list.add(102);
        my_list.add(339);
        my_list.add(221);
        my_list.add(50);
        my_list.add(70);

        List<Integer> divisibleBy13 = new ArrayList<>();

        for (int number : my_list) {
            if (number % 13 == 0) {
                divisibleBy13.add(number);
            }
        }

        System.out.println(divisibleBy13);
    }
}
