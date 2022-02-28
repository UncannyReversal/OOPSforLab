package vowel_count;
import java.util.*;
class vowel
{
    String str;
    vowel(String vl)
    {
        str = vl;
    }
    void compute()
    {
       int len=str.length(),count=0;
       for(int i=0;i<len;i++)
       {
           char ch = str.charAt(i);
           if(ch =='A'||ch =='a'||ch =='e'||ch =='E'||ch =='I'||ch =='i'||ch =='u'||ch =='U'||ch =='o'||ch =='O')
               count++;
       }
       System.out.println("Total number of vowels present:"+count); 
    }
}
public class Vowel_count 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1=obj.nextLine();
        vowel obj1 = new vowel(s1);
        obj1.compute();
    } 
}