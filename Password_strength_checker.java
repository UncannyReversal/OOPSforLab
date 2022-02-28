package password_strength_checker;
import java.util.*;
class password
{
    String pass;
    password(String p)
    {
        pass = p ;
    }
    void strength()
    {
        int al=0,di=0,sp=0;
        int n = pass.length();
        if (n>=6 && n<= 15)
        {
            
            if(Character.isAlphabetic(pass.charAt(0)) || Character.isDigit(pass.charAt(0)))  
            {
                for(int i = 0;i < n;i++)
                {
                    char ch = pass.charAt(i);
                    if(pass.charAt(i) != ' ')
                    {
                        if(Character.isAlphabetic(pass.charAt(i)))
                            al++; 
                        if(Character.isDigit(pass.charAt(i)))
                            di++; 
                        if(!Character.isAlphabetic(pass.charAt(i)) && !Character.isDigit(pass.charAt(i)))
                            sp++; 
                        if(al>2 && di>2 && sp>1)
                        {
                            System.out.println("Strong password....");
                            break;
                        }
                    } 
                    else
                    {
                        System.out.println("Password invalid");
                        System.exit(0);
                    }
                }
                if(al<1 || di<1 || sp<1)
                {
                    System.out.println("Password invalid");
                    System.exit(0);
                }
                if(al<=2 || di<=2 || sp<=1)
                {
                    System.out.println("Weak password....");
                }  
            }     
            else
                System.out.println("Password invalid");     
        }
        else
            System.out.println("Password invalid");      
    }
}

public class Password_strength_checker
{
    public static void main(String[] args)
    {
        
        Scanner obj = new Scanner(System.in);  
        System.out.print("Enter your password: ");
        String pass = obj.nextLine();
        password obj1 = new password(pass);
        obj1.strength();
    }
}
