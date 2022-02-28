package credit_account_class;
import java.util.*;
class credit
{
    int acc_num,bal,total,cred_limit,cred,new_bal;
    credit(int acc,int b,int tot,int c_limit,int cre)
    {
    acc_num = acc;
    bal = b;
    total = tot;
    cred_limit = c_limit;
    cred =cre;
    }
    void cal()
    {
        new_bal = bal + total - cred;
    }
    void display()
    {
        if(new_bal > cred_limit)
            System.out.println("Credit limit exceeded");
        else
            System.out.println("New balance: "+new_bal);
    }
}
public class Credit_account_class 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Account number: ");
        int acc_num = obj.nextInt();
        System.out.print("Balance at the beginning of the month: ");
        int balance = obj.nextInt();
        System.out.print("Total of all items charged by the customer this month: ");
        int total = obj.nextInt();
        System.out.print("Allowed credit limit: ");
        int credit_lim = obj.nextInt();
        System.out.print("Credits in the month: ");
        int credit = obj.nextInt();
        credit obj1 = new credit(acc_num,balance,total,credit_lim,credit);
        obj1.cal();
        obj1.display();
    }  
}
