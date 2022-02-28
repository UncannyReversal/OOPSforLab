package calculator_method_overloading;
import java.util.*;
class calc
{
    void add(int n1,int n2)
    {
        int sum = n1+n2;
        System.out.println("The sum of integers: "+sum);
    }
    void add(int r1,int r2,int i1,int i2)
    {
        int sum1 = r1+r2;
        int sum2 = i1+i2;
        if(sum2 < 0)
            System.out.println("The sum of complex numbers: "+sum1+sum2+"j");
        else
            System.out.println("The sum of complex numbers: "+sum1+"+"+sum2+"j");
    }
    void sub(int n1,int n2)
    {
        int diff = n1-n2;
        System.out.println("The difference of integers: "+diff);
    }
    void sub(int r1,int r2,int i1,int i2)
    {
        int diff1 = r1-r2;
        int diff2 = i1-i2;
        if(diff2 < 0)
            System.out.println("The difference of complex numbers: "+diff1+diff2+"j");
        else
            System.out.println("The difference of complex numbers: "+diff1+"+"+diff2+"j");
    }
    void mul(int n1,int n2)
    {
        int pro = n1*n2;
        System.out.println("The product of integers: "+pro);
    }
    void mul(int r1,int r2,int i1,int i2)
    {
        int pro1 = r1*r2;
        int pro2 = r1*i2;
        int pro3 = i1*r2;
        int pro4 = -(i1*i2);
        int sum1 = pro1+pro4;
        int sum2 = pro2+pro3;
        if(sum2 < 0)
            System.out.println("The product of complex numbers: "+sum1+sum2+"j");
        else
            System.out.println("The product of complex numbers: "+sum1+"+"+sum2+"j");
    }
}
public class Calculator_method_overloading 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        //for integers
        System.out.println("Enter the integer inputs for operations: ");
        System.out.print("Enter num1: ");
        int n1 = obj.nextInt();
        System.out.print("Enter num2: ");
        int n2 = obj.nextInt();
        calc obj1 = new calc();
        obj1.add(n1, n2);
        obj1.sub(n1, n2);
        obj1.mul(n1, n2);
        
        //for complex
        System.out.println("\nEnter the inputs for complex operations: ");
        System.out.print("Enter real_1: ");
        int r1 = obj.nextInt();
        System.out.print("Enter imaginary_1: ");
        int i1 = obj.nextInt();
        System.out.print("Enter real_2: ");
        int r2 = obj.nextInt();
        System.out.print("Enter imaginary_2: ");
        int i2 = obj.nextInt();
        obj1.add(r1,r2,i1,i2);
        obj1.sub(r1,r2,i1,i2);
        obj1.mul(r1,r2,i1,i2);  
    }    
}


