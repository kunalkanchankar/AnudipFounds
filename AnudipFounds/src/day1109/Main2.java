
//Write brief infirmation about you in one text file and copy that content in other text file.

package day1109;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        // Step 1: Creating and write my deatils
        try {
            FileWriter writer = new FileWriter("info.txt");
            writer.write("I am Kunal Kanchankar, an aspiring software developer ready to kick-start my professional journey in the dynamic world of software development. I am poised to contribute positively to the field as a fresher. I have a potent command of multiple programming languages, including Java, HTML, CSS, and Python. My ability to work with these languages provides me to contribute effectively to software development projects. As a continuous learner, I actively seek ways to expand my skill set. By engaging in personal projects and online coding platforms, I further develop my understanding of software engineering best practices. ");
            writer.close();
            System.out.println("updated");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 2: Read from the first file and copy to the second file
        try {
            FileReader reader = new FileReader("info.txt");
            FileWriter writer = new FileWriter("Demo.txt");
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            reader.close();
            writer.close();
            System.out.println("Copyed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
