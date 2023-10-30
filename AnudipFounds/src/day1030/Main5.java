package day1030;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<Character> my_list = new ArrayList<>();
        my_list.add('f');
        my_list.add('t');
        my_list.add('r');
        my_list.add('f');
        my_list.add('m');
        my_list.add('x');

        List<Character> new_list = new ArrayList<>();

        for (char ch : my_list) {
            if (ch != 'f') {
                new_list.add(ch);
            }
        }

        System.out.println(new_list);
    }
}
