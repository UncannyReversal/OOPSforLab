package thread_bank;
    
class BankAccount
{  
    double bal;
    String name;
    BankAccount(double amt,String n)
    {
        bal = amt;
        name = n;
    }
    synchronized void deposit(double amt)
    {
        bal += amt;
    }
    synchronized void transfer(BankAccount obj, double amt)
    {
        if(bal> amt){
            bal -= amt;
            obj.bal += amt;
        }
        else
            System.out.println("Insufficient balance in " + name);
    }
    synchronized void display()
    {
        System.out.println("Account number: "+name+"  --->  "+"Balance: "+bal);
    }
}

class AccThread extends Thread{
    BankAccount myAcc,toAcc;
    double depositAmt,transferAmt;
    AccThread(double bal,String name)
    {
        myAcc = new BankAccount(bal,name);
    }
    public void setTransaction(double d_amt,AccThread obj,double t_amt){
        toAcc = obj.myAcc;
        depositAmt = d_amt;
        transferAmt = t_amt;
    }
    @Override
    public void run(){
        myAcc.deposit(depositAmt);
        myAcc.transfer(toAcc,transferAmt);
        myAcc.display();
    }  
}

public class Thread_bank {
    public static void main(String[] args) {
       AccThread acc1 = new AccThread(1000,"Acc 1");
       AccThread acc2 = new AccThread(1000,"Acc 2");
       AccThread acc3 = new AccThread(1000,"Acc 3");
       acc1.setTransaction(10000,acc2,2000);
       acc2.setTransaction(20000,acc3,2753);
       acc3.setTransaction(30000,acc1,5553);
       acc1.start();
       acc2.start();
       acc3.start();
    }   
}