package curr_acc_sav_acc_method_overriding;
import java.util.*;
class account
{
    String name;
    long acc_num;
    String acc_type;
    double bal;
    account(String n,long an,String at,double b)
    {
        name = n;
        acc_num = an;
        acc_type = at;
        bal = b;
    }
    void deposit(double d){};
    void withdrawal(double d){};
    void check(){};
    double interest_calc(){return 0;};  
}

class Sav_acct extends account
{
    Sav_acct(String n,long an,String at,double b)
    {
        super(n,an,at,b);
    }
    @Override
    void deposit(double r)
    {
        bal += r;
        System.out.println("Your balance is: "+bal);
    }
    @Override
    double interest_calc()
    {
        int n = 5;
        double r = 0.05;
        double SI = (bal*n*r)/100;
        System.out.println("\nInterest added");
        return SI;
    }
    @Override
    void withdrawal(double r)
    {
        bal -= r; 
        System.out.println("Your balance is: "+bal);
    }         
}
class Curr_acct extends account
{
    double min_bal,penalty;
    Curr_acct(String n,long an,String at,double b)
    {
        super(n,an,at,b);
        min_bal = 1000.0;
        penalty = 5;
    }
    @Override
    void deposit(double r)
    {
        bal += r;
        System.out.println("Your balance is: "+bal);
    }
    @Override
    void withdrawal(double r)
    {
        bal -= r;
        System.out.println("Your balance is: "+bal);
    }   
    @Override
    void check()
    {
        System.out.println("\nMinimum balance is "+min_bal);
        if(bal < min_bal)
        {
            System.out.println("Minimum balance not maintained.....Penalty imposed.\nPenalty Amount: "+penalty);
            withdrawal(penalty);
        }
        else
            System.out.println("Minimum balance maintained.....\nYour balance: "+bal);
         
    }
}


public class Curr_acc_sav_acc_method_overriding 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double bal=50000;
        String name,type="";
        System.out.println("Enter Account holder details:");
        System.out.print("Enter name:");
        name=obj.nextLine();
        System.out.print("Accout number: ");
        long acc_no=obj.nextLong();
        System.out.print("\n1.Current Account \n2.Savings Account \n\nEnter your choice: ");
        int choice=obj.nextInt();
        System.out.print("\nYour initial balance is: "+bal);
        switch(choice)
        {
            case 1:
                type="Current Account";
                Curr_acct a1=new Curr_acct(name,acc_no,type,bal);
                System.out.print("\n\nEnter the Deposit amount: ");
                double d_amt1=obj.nextDouble();
                a1.deposit(d_amt1);
                System.out.print("Enter the Withdrawl amount: ");
                double w_amt1=obj.nextDouble();
                a1.withdrawal(w_amt1);
                a1.check();
                break;
            case 2:
                type="Savings Account";
                Sav_acct a2=new Sav_acct(name,acc_no,type,bal);
                System.out.print("\n\nEnter the Deposit amount: ");
                double d_amt2=obj.nextDouble();
                a2.deposit(d_amt2);
                a2.deposit(a2.interest_calc());
                System.out.print("Enter the Withdrawl amount: ");
                double w_amt2=obj.nextDouble();
                a2.withdrawal(w_amt2);
                break;
        }
    }
}
