package class_electronic_shop;
import java.util.*;
class SHOP
{
    String product_name;
    double product_price;
    SHOP(String product_name,double product_price)
    {
       this.product_name = product_name;
       this.product_price = product_price;
    }
    void showinfo()
    {
        System.out.println(product_name+" : "+product_price);
    }
}
public class Class_electronic_shop 
{ 
    public static void main(String[] args) 
    {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter the number of products:");
        int n = obj1.nextInt();
        for(int i = 0; i < n ;i++)
        {
            System.out.print("\nEnter the name of products:");
            String prod_name = obj1.next();
            System.out.print("Enter the price of products:");
            double prod_price = obj1.nextDouble();
            SHOP obj = new SHOP(prod_name,prod_price);
            obj.showinfo();
        }
    } 
}
