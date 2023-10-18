package day1003;

public class Punctuation {
    public static void main(String[] args) {
        
    	String sentence = "He said,@ 'The mailman loves you.' I heard it with my own ears.";

        String punctuationMarks = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        int count =0;
        System.out.println("Punctuation found: ");
        for (char character : sentence.toCharArray()) {
            if (punctuationMarks.contains(String.valueOf(character))) {
                System.out.print("  " + character);
                count++;
            }
        }
        System.out.println("\ntotal number of Puctuation is : " + count);
    }
}
