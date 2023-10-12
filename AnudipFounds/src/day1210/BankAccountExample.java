package day1210;

//Abstract BankAccount class
abstract class BankAccount {
 private String accountNumber;
 private double balance;

 // Constructor
 public BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Abstract methods
 public abstract void deposit(double amount);
 public abstract void withdraw(double amount);
}

//Subclass CheckingAccount
class CheckingAccount extends BankAccount {
 public CheckingAccount(String accountNumber, double balance) {
     super(accountNumber, balance);
 }

 // Implement deposit and withdraw methods
 @Override
 public void deposit(double amount) {
     System.out.println("deposit amount : "+amount);
 }

 @Override
 public void withdraw(double amount) {
     System.out.println("withdrawal amount : "+amount);
     
 }
}

public class BankAccountExample {
 public static void main(String[] args) {
     CheckingAccount account = new CheckingAccount("123456789", 1000.0);

     account.deposit(500.0);
     account.withdraw(300.0);
 }
}

