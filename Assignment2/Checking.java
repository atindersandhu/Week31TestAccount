package Assignment2;
public class Checking extends Account
{
    public Checking(double balance)
    {
        super(balance); //super class cons
    }
    public double withdraw(double w)
    {
        setBalance(getBalance()-w);
        return getBalance();
    }
    public double deposit(double d)
    {
        setBalance(getBalance()+d);
        return getBalance();
    }
}
