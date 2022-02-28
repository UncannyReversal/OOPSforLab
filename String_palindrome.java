package string_palindrome;
import java.util.*;
class palindrome
{
    String str;
    palindrome(String s)
        {
            str = s;
        }
    void check()
    {
       StringBuffer s2 = new StringBuffer(str);
       s2.reverse();
       String s4 = new String(s2);
       System.out.println("palindrome : "+s2);
       if(str.equalsIgnoreCase(s4))
           System.out.println("It is a palindrome");
       else 
           System.out.println("It is not a palindrome"); 
    }
}
public class String_palindrome 
{
    public static void main(String[] args) 
    {
        Scanner obj= new Scanner(System.in);
        System.out.print("enter the string: ");
        String s1=obj.nextLine();
        palindrome obj1 = new palindrome(s1);
        obj1.check();  
    }
}