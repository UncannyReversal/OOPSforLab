package armstrong;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
       int n = 1635;
       int num1 = n,num2 = n;
       int count=0,sum = 0;
       while(num1!=0)
       {
           count++;
           num1 = num1/10;
       }
       while(n != 0)
       {
           int a = n % 10;
           sum += Math.pow(a,count);
           n /= 10; 
       }
       if(sum == num2)
           System.out.println(num2+" is an Amstrong number");
       else
           System.out.println(num2+" is not an Amstrong number");
           
    }
    
}
