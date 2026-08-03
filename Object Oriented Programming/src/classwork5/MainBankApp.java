package classwork5;
public class MainBankApp { 
    public static void main(String[] args){ 
        BankAccount acc = new BankAccount();
        acc.setAccountNumber("10987653655");
        acc.setAccountHolder("Garri Boy");
        acc.setBalance(1000);
        
        acc.displayDetails();
        acc.deposit();
        
    }
}
