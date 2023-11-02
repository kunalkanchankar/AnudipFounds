//Write a program using custom Exception.
//
// There is a government scheme for the poor people to supply rice, pulses etc. 
//For this an application has to developed in which the applicants income 
//has to be taken from different sources. If income is <=10000 the 
//application will be accepted. Else the application will be rejected.


package day1102;

class IncomeHighException extends Exception {
    public IncomeHighException(String message) {
        super(message);
    }
}

class Goverment {
    public void applyForScheme(int income) throws IncomeHighException {
        if (income <= 10000) { //checking the condition 
            System.out.println("Application accepted  You are eligible");
        } else {
            throw new IncomeHighException("Rejected Income is too high.");
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Goverment application = new Goverment();

        try {
        	// default value for income
            int applicantIncome = 125200; 
            application.applyForScheme(applicantIncome);
        } catch (IncomeHighException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
