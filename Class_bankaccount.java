package class_bankaccount;
import java.util.*;
class bankaccount
{
    String name;
    long acc_num;
    String acc_type;
    double acc_balance;
    bankaccount(String n,long an,String at,double ab)
    {
        name = n;
        acc_num = an;
        acc_type = at;
        acc_balance = ab;
    }
    void deposit(double d)
    {
        acc_balance += d;
        System.out.println("\nThe new balance is: "+acc_balance);
    }
    void withdraw(double d)
    {
        if(d <= acc_balance)
        {
            acc_balance -= d;
            System.out.println("\nBalance after withdrawal is: "+acc_balance);
        }
        else
            System.out.println("\nInsufficiet balance");
    }
    void display()
    {
        System.out.println("\nThe account details:");
        System.out.println("Name: "+name+"\nBalance: "+acc_balance);
    }        
}
 class Class_bankaccount {
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the depositer name: ");
        String name = obj.nextLine();
        System.out.print("Enter the account number: ");
        long accnum = obj.nextLong();
        System.out.println("\nEnter the type of account: \n1)Current account\n2)Savings account\n");
        int choice = obj.nextInt();
        String acctype = "";
        switch(choice)
        {
            case 1:
                acctype = "Current account";
                break;
            case 2:
                acctype = "Savings account";
                break;
        }
        System.out.println("Your account is: "+acctype);
        System.out.print("\nEnter the balance amount: ");
        double balamt = obj.nextDouble();
        bankaccount b1 = new bankaccount(name,accnum,acctype,balamt);
        System.out.print("\nEnter the amount to be deposited: ");
        double depo = obj.nextDouble();
        b1.deposit(depo);
        System.out.print("\nEnter the amount to be withdraw: ");
        double wd= obj.nextDouble();
        b1.withdraw(wd);
        b1.display();
    } 
}