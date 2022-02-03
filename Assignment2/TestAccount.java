package Assignment2;
import Assignment2.BankAccount;

public class TestAccount 
{
    public static void main(String[] args) {
       BankAccount pAccount = new BankAccount(500, 2);
       pAccount.deposit(100);
       System.out.println(pAccount.getBalance());
       
       
       
       
       BankAccount aAccount = new BankAccount(1000, 1);
       aAccount.deposit(200);
       System.out.println(aAccount.getBalance());
       

       System.out.println(BankAccount.getNumOfAccounts());
    }    
}
