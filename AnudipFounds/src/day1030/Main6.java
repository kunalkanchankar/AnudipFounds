package day1030;

import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        List<Integer> my_list = new ArrayList<>();
        my_list.add(-4);
        my_list.add(8);
        my_list.add(5);
        my_list.add(-22);
        my_list.add(0);
        my_list.add(-67);

        List<Integer> new_list = new ArrayList<>();

        for (int number : my_list) {
            if (number < 0) {
                new_list.add(number);
            }
        }

        System.out.println(new_list);
    }
}
