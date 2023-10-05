package day0510;

//WAP to enter any sentence and calculate the following:
//	  a) Total number of digits present in it.
//	  b) Total number of small letters and capital letters present in it.
//	  c) Total number of alphabets used in it.
//	  d) Total number of special character used in it.
//	  e) Total number of vowels presents in it.
//	  f) Total Number words present in that sentence.

public class StringArray {

	public static void main(String[] args) {
		
		String sen = "There are 0 traffic rules Followed by 100 million @ People";
		int len = sen.length();
		
		Findings obj = new Findings();
		obj.digit(sen,len);
		obj.caseSensitive(sen,len);
		obj.alphabets(sen,len);
		obj.specialChar(sen,len);
		obj.vowels(sen,len);
		obj.works(sen,len);
			
	}

}
class Findings{
	void digit(String sen , int len) {
		int count = 0;
        for (int i = 0; i < len; i++) {
            char ch = sen.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        System.out.println("Digits Count is :"+count);
	}
	void caseSensitive(String sen , int len) {
		String[] word = sen.split(" ");
		int count1=0,count2 =0;
		for(String s:word) {
			for(char ch : s.toCharArray()) {
				if(ch>'a'&&ch<'z') {
					count1++;
				}
				if(ch>'A'&&ch<'Z') {
					count2++;	
				}
			}
		}
		System.out.println("Small Case Alphabets Count is :"+count1);
		System.out.println("Capital Case Alphabets Count is :"+count2);
	}
	void alphabets(String sen , int len) {
		String[] word = sen.split(" ");
		int count =0;
		for(String s:word) {
			for(char ch : s.toCharArray()) {
				if(ch>'a'&&ch<'z' || ch>'A'&&ch<'Z') {
					count++;	
				}
			}
		}
		System.out.println("Alphabets Count is :"+count);
	}
	void specialChar(String sen , int len) {
		
		String special = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        int count =0;
        for (char ch : sen.toCharArray()) {
            if (special.contains(String.valueOf(ch))) {
                System.out.print("  " + ch);
                count++;
            }
        }
        System.out.println("\nSpecial Character count is : " + count);
	}
	void vowels(String sen , int len) {
		String[] word = sen.split(" ");
		int count =0;
		for(String s:word) {
			if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u') {
				System.out.println("Vowel is present in this sentence");
				count++;				
			}
		}
		System.out.println("Vowel Count is :"+count);
	}
	void works(String sen , int len) {
		String[] word = sen.split(" ");
		int count =0;
		for(String s:word) {
			count++;
		}
		System.out.println("Word Count is :"+count);
	}
}
