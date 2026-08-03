package classwork5;
import java.util.Scanner;
public class BankAccount { 
    private String accountNumber;
    private String accountHolder;
    private double balance;
    Scanner scan = new Scanner(System.in);

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void deposit(){ 
     System.out.print("Enter the amount to be deposited: ");
     double amount = scan.nextDouble();
     balance += amount;
     System.out.printf("you have successfully deposited %d%n",amount);
    }
    
    public void withdraw(){ 
     System.out.print("Enter the amount to be withdrawn: ");
     double amount = scan.nextDouble();
     if (balance <= amount){ 
         balance -= amount;
         System.out.printf("you have successfully withdrawn %d%n",amount);
     }else{ 
         System.out.println("Insufficient balance");
     };
    }
    public void displayDetails(){ 
        System.out.printf("Account number: %s%n",accountNumber);
        System.out.printf("Account Holder: %s%n",accountHolder);
        System.out.printf("Account Balance: %d%n",balance);
    }
}
