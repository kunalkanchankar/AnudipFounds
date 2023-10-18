package day1003;

public class Capitalize{
    public static void main(String[] args) {
        String sen = "there are no traffic rules followed by people";
        String[] words = sen.split("\\s+"); 

        StringBuilder str = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) { 
                String addstr = word.substring(0, 1).toUpperCase() + word.substring(1);
                str.append(addstr).append(" ");
            }
        }
        System.out.println(str.toString());
    }
}
