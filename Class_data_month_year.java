package class_data_month_year;
import java.util.*;
class Date
{
    int day,month,year;
    Date(int day,int month,int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    void display()
    {
        if(day>=31 || month>=12 || year<0)
            System.out.println("Invalid one");
        else
            System.out.println(day+" / "+month+" / "+year);
    }
}
public class Class_data_month_year 
{
    public static void main(String[] args) 
    {
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter Day : ");
        int day=obj.nextInt();
        System.out.print("Enter month : ");
        int month=obj.nextInt();
        System.out.print("Enter year : ");
        int year=obj.nextInt();
        Date d=new Date(day,month,year);
        d.display();
    }  
}
