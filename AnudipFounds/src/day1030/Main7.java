package day1030;

import java.util.ArrayList;
import java.util.List;

public class Main7 {
    public static void main(String[] args) {
        List<String> L = new ArrayList<>();
        L.add("cat");
        L.add("sat");
        L.add("mat");
        L.add("python");
        L.add("java");
        L.add("R");

        List<String> newList = new ArrayList<>();

        for (String str : L) {
            if (str.length() >= 4) {
                newList.add(str);
            }
        }

        System.out.println(newList);
    }
}
