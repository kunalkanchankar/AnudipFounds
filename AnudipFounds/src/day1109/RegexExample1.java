package day1109;

import java.util.regex.*;

public class RegexExample1 {
    public static void main(String[] args) {
        String password = "kunal@###12";
        Pattern p = Pattern.compile("(?=.*[^a-zA-Z0-9]).{8,20}$");
        Matcher m = p.matcher(password);
        boolean var = m.matches();
        
        if (var) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }

}
