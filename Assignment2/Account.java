package Assignment2;
public abstract class Account 
{
    private double balance;
    public Account(double balance)
    {
        setBalance(balance);
    }
    public double getBalance()
    {
        return this.balance;
    }
    public void setBalance(double balance)
    {
        if(balance<0)
            throw new IllegalArgumentException("balance cant be -ve");
        else
            this.balance=balance;
    }
    public String toString() //non abstract method
    {
        return "Account class balance = "+balance;
    }
    public void show() //non abstract method
    {
        System.out.println("this is account class show method");
    }
    public abstract double withdraw(double w);
    public abstract double deposit(double d);
    
}