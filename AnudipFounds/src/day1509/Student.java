package day1509;
public class Student {
	public static void main(String[] args) {
		Grade obj = new Grade();
		float avg = obj.findAvg(100,50,100);
		char grade = obj.findGrade(avg);
		System.out.println("Student's Avg is: " + avg);
        System.out.println("Student's grade is: " + grade);
    }
}
class Grade{
	float findAvg(float marks1,float marks2,float marks3) {
		float avg = (marks1 + marks2 + marks3)/3;
		return avg;
	}
	char findGrade(float avg) {
		char grade;
		if (avg >= 90 && avg<=100) {
            grade = 'A';
        } else if (avg >= 80 && avg<90) {
            grade = 'B';
        } else if (avg >= 70 && avg<80) {
            grade = 'C';
        } else if (avg >= 60 && avg<75) {
            grade = 'D';
        } else {
            grade = 'F'; 
        }
		return grade;
	}
}