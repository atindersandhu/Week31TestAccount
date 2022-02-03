package Assignment2;


public class Saving extends Account
{
    public Saving(double balance)
    {
        super(balance); //super class cons
    }
    public double withdraw(double w)
    {
        if(getBalance()<100)
            throw new IllegalArgumentException("cant withdraw,not enough balance");
        else
        {    
            setBalance(getBalance()-w);
            return getBalance();
        }
    }
    public double deposit(double d)
    {
        setBalance(getBalance()+d);
        return getBalance();
    }
    public void show()
    {
        super.show(); //super class method
        System.out.println("this is saving show method");
    }
    public String toString() //non abstract method
    {
        return super.toString()+ "saving Account class tostring method";
    }
}
