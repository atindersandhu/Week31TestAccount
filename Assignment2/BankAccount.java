package Assignment2;
public abstract class BankAccount {
    
    private double balance;
    public int numDeposits;
    public int numWithdrawls;
    public float intRate;


    public BankAccount(double balance, float intRate) {
        this.balance = balance;
        this.intRate = intRate;
    }
public void deposit(double depositAmount) {
    this.balance = this.balance + depositAmount;
    this.numDeposits++;
}

public void withdraw(double withdrawlAmmount) {
    this.balance = this.balance - withdrawlAmmount;
    this.numWithdrawls++;
        
}
public void calcInterest() {
    float monthlyIntRate = this.intRate/12;
    double monthlyInterest = this.balance * monthlyIntRate;
    this.balance = this.balance + monthlyInterest;
}
public abstract void monthlyProcess(); 
   
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

  
    
}
