//Use the Account class created as above to simulate an ATM machine.
// Create 10 accounts with id AC001…..AC010 with initial balance 300₹.
// The system prompts the users to enter an id. If the id is entered incorrectly, ask the user to enter a correct id.
// Once an id is accepted, display menu with multiple choices.
// 1. Balance inquiry
// 2. Withdraw money [Maintain minimum balance 300₹]
// 3. Deposit money
// 4. Money Transfer
// 5. Create Account
// 6. Deactivate Account
// 7. Exit Hint: Use ArrayList, which is can shrink and expand with compared to Array
package Pra2;
import java.lang.*;
import java.util.*;
class P2_3
{
    String id;
    int balance;
    P2_3(String i)
    {
        id = i;
        balance = 300;
    }
    void BalanceInq()
    {
        System.out.println("ID :- " + id);
        System.out.println("Balance :- " + balance);
    }
    void withdraw()
    {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw :- ");
        temp = sc.nextInt();
        if(balance - temp < 300)                        //We ues if else condition for minimum balance and check current balance
            System.out.println("Minimum 300 balance is needed");
        else
        {
            balance = balance - temp;
            System.out.println("Current balance :- " + balance);
        }
    }
    void deposit()
    {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit :- ");
        temp = sc.nextInt();
        balance = balance + temp;
        System.out.println("Currently available balance :- " + balance);
    }
    void moneyTransfer(ArrayList ar)
    {
        int temp;
        String id;
        Scanner sc = new Scanner(System.in);
        P2_3 ac = null;
        System.out.print("Enter ID to transfer :- ");
        id = sc.next();
        Iterator itr = ar.iterator();
        while(itr.hasNext())
        {
            P2_3 a = (P2_3) itr.next();
            if(id.equals(a.id))
                ac = a;

        }
        if(ac == null)               //Here we use if else for account transfer and for balance inquiry
            System.out.println("Account not found");
        else
        {
            System.out.print("Enter amount to transfer :- ");
            temp = sc.nextInt();
            if(temp > balance)
                System.out.println("Not enough balane to transfer");
            else
            {
                ac.balance = ac.balance + temp;
                balance = balance - temp;
            }

        }
    }
    void Create(ArrayList arr)  //We use create to create the new id
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID :- ");
        str = sc.next();
        P2_3 ac = new P2_3(str);
        arr.add(ac);
    }
    void delete(ArrayList arr)     //Here we use delete to delete a id
    {
        String str;
        Scanner sc = new Scanner(System.in);
        P2_3 ac = null;
        System.out.print("Enter ID :- ");
        str = sc.next();
        Iterator itr = arr.iterator();
        while(itr.hasNext())
        {
            P2_3 a = (P2_3) itr.next();
            if(str.equals(a.id))
                ac = a;

        }
        if(ac == null)   //Here we use if else for account found or not and account remove
            System.out.println("Account not found");
        else
        {
            arr.remove(ac);
            System.out.println("Account removed successfully");
        }
    }
}