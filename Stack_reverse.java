package stack_reverse;
import java.util.*;
class Reverse
{
    String str;
    Reverse(String str)
    {
        this.str = str;
    }
    void rev()
    {
        int n = str.length();
        Stack s = new Stack();
        for(int i=0;i<n;i++)
        {
            char ch = str.charAt(i);
            s.push(ch);
        }
        System.out.print("The reverse is: ");
        for(int i=0;i<n;i++)
        {
            Character ch;
            ch = (Character)s.pop(); 
            System.out.print(ch);
        }
        System.out.println("");
    } 
}

public class Stack_reverse 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter the string:");
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        Reverse r = new Reverse(str);
        r.rev();
    }    
}
