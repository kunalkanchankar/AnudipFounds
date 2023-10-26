package day1026;


import java.util.HashMap;

public class Main1 {
    public static void main(String[] args) {
        // Create HashMap 
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 1; i <= 15; i++) {
            hashMap.put(i, i + i);
        }

        for (int key : hashMap.keySet()) {
            int value = hashMap.get(key);
            System.out.println("( "+ key + ", " + value+" )");
        }
    }
}
