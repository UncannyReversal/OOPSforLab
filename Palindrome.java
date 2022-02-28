package palindrome;
public class Palindrome {
    public static void main(String[] args) {
        int a = 123;
        int b = a;
        int rev = 0;
        int rem ;
        while(a != 0)
        {
            rem = a % 10;
            rev = (rev*10) + rem;
            a /= 10; 
        }
        if(rev == b)
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
    }
}
