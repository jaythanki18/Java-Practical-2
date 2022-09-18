//Design a class named Account that contains:
//• A private int data field named id for the account (default 0).
//• A private double data field named balance for the account (default 500₹).
// • A private double data field named annualInterestRate that stores the current interest rate (default 7%). Assume all accounts have the same interest rate.
//• A private Date data field named dateCreated that stores the date when the account was created.
//• A no-arg constructor that creates a default account.
//• A constructor that creates an account with the specified id and initial balance.
// • The accessor and mutator methods for id, balance, and     annualInterestRate.
// • The accessor method for dateCreated.
// • A method named getMonthlyInterestRate() that returns the monthly interest rate.
//• A method named getMonthlyInterest() that returns the monthly interest. • A method named withdraw that withdraws a specified amount from the account.
//• A method named deposit that deposits a specified amount to the account.
package Pra2;
import java.util.Date;
class P2_2
{
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated = new Date();
    public P2_2()
    {
        id=1;
        balance=500;
        annualInterestRate=7;
    }
    public P2_2(int newId, double newBalance)  //Here we use constructor
    {
        id=newId;
        balance=newBalance;
        annualInterestRate=0.07;
    }
    public P2_2(int newId, double newBalance, double newAnnualInterestRate)  //Here we use constructor
    {
        id=newId;
        balance=newBalance;
        annualInterestRate=newAnnualInterestRate;
    }

    public int getId()  //Here We use Getter
    {
        return id;
    }
    public double getBalance()  //Here We use Getter
    {
        return balance;
    }
    public double getAnnualInterestRate()  //Here We use Getter
    {
        return annualInterestRate;
    }
    public void setId(int newId)      //Here we use setter
    {
        id=newId;
    }
    public void setBalance(int newBalance)     //Here we use setter
    {

        balance=newBalance;
    }
    public void setAnnualInterestRate(int newAnnualInterestRate)     //Here we use setter
    {

        annualInterestRate =newAnnualInterestRate;
    }

    double getMonthlyInterestRate()
    {
        return(annualInterestRate/12);
    }
    double getMonthlyInterest()
    {
        return(balance*(
                annualInterestRate/12));
    }
    public java.util.Date getDate()
    {

        return this.dateCreated;
    }
    double Withdraw(double amount)
    {
        if(balance-amount < 0)
        {}
        else
        {
            balance-=amount;
        }
        return balance;
    }
    double Deposit(double amount)
    {
        return balance+=amount;
    }
}
