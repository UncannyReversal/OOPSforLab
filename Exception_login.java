package exception_login;
import java.util.*;

class InvalidNameException extends Exception
{
    String s;
    InvalidNameException(String s)
    {
        this.s = s; 
    }
    public String toString()
    {
        return s;
    }
}

class valid
{
    boolean check_username(String name)
    {
        int af=0,df=0;
        for(int i =0;i<name.length();i++)
        {
            char ch = name.charAt(i);
            if(Character.isLetter(ch))
                af = 1;
            if(Character.isDigit(ch))
                df = 1;
        }
        if(af == 1 && df ==1)
            return true;
        else
            return false;
    }
    
    boolean check_pass(String pass)
    {
        int n = pass.length();
        if(n>=6 && n<=8)
            return true;
        else
            return false;
    }
    
    boolean check_age(int age)
    {
       if(age > 0)
            return true;
        else
            return false; 
    }
    
    boolean check_mail(String mail)
    {
        int n=0;
        for(int i =0;i<mail.length();i++)
        {
            char ch = mail.charAt(i);
            if(ch == '@')
                n++; 
        }
        if(n == 1)
            return true;
        else
            return false;
    }
}

public class Exception_login
{
    public static void main(String[] args)
    {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter the login details: ");
        
        System.out.print("Enter the username:");
        String name = obj1.next();
        valid ob = new valid();
        try{
           if(!ob.check_username(name))
               throw new InvalidNameException("Invalid Username");
        }
        catch(InvalidNameException err){
            System.out.println(err);
        }
        
        System.out.print("Enter the password:");
        String pw = obj1.next();
         try{
           if(!ob.check_pass(pw))
               throw new InvalidNameException("Invalid Password");
        }
        catch(InvalidNameException err){
            System.out.println(err);
        }
         
        System.out.print("Enter the age:");
        int age = Integer.parseInt(obj1.next());
         try{
           if(!ob.check_age(age))
               throw new InvalidNameException("Invalid Age");
        }
        catch(InvalidNameException err){
            System.out.println(err);
        }
         
        System.out.print("Enter the mail id:");
        String mail = obj1.next();
         try{
           if(!ob.check_mail(mail))
               throw new InvalidNameException("Invalid Mail Id");
        }
        catch(InvalidNameException err){
            System.out.println(err);
        }
    }   
}