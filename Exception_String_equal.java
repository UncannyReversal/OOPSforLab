package exception_string_equal;
import java.util.*;
class NoMatchException extends Exception{
    String s1;
    NoMatchException(String s){
        s1  = s;
    }
    public String toString(){
        return s1;
    }
}
class Equal{
    String s;
    Equal(String str){
        s = str;
    }
    void check()
    throws NoMatchException
    {
        try{
            if(!(s.equals("Java"))){
                throw new NoMatchException("The String is not equal");
            }
            else{
                System.out.println("The string is equal");
            }
        }
        catch(NoMatchException e){
            System.out.println(e);
        }
    }
}
public class Exception_String_equal {
    public static void main(String[] args) {
      System.out.print("Enter the string: ");
      Scanner obj = new Scanner(System.in);
      String str = obj.nextLine();
      Equal o = new Equal(str);
      try{
      o.check();
      }
      catch(NoMatchException e){
          System.out.print(e);
      }
    } 
}
