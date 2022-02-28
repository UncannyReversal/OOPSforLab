package area_vol_inher;
import java.util.*;

class Shape
{
    double length,breadth,height,area,volume;
    Shape(double l,double b, double h)
    {
        length = l;
        breadth = b;
        height = h;
    }
    Shape(double l,double b){
        length = l;
        breadth = b;
    }
}
class TwoDimension extends Shape
{
    TwoDimension(double l,double b){
        super(l,b);
    }
    void calcArea(){
        area = length*breadth;
        System.out.println("The area of the rectangle is "+area);
    }
}
class ThreeDimension extends Shape
{
    ThreeDimension(double l,double b,double h)
    {
        super(l,b,h);
    }
    void calcAreaVolume(){
        area =(2*length*breadth) + (2*height*breadth) + (2*length*height);
        volume = length*breadth*height;
        System.out.println("The area of the cuboid is "+area);
        System.out.println("The volume of the cuboid is "+volume);
    }
}
public class Area_vol_inher 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        //For 2D shape
        System.out.println("Enter the dimensions for 2D:");
        System.out.print("Enter the length: ");
        float l1 = obj.nextFloat();
        System.out.print("Enter the breadth: ");
        float b1 = obj.nextFloat();
        TwoDimension obj1 = new TwoDimension(l1,b1);
        obj1.calcArea();
        System.out.println();
       
        //For 3D shape
        System.out.println("Enter the dimensions for 3D:");
        System.out.print("Enter the length: ");
        float l2 = obj.nextFloat();
        System.out.print("Enter the breadth: ");
        float b2 = obj.nextFloat();
        System.out.print("Enter the height: ");
        float h2 = obj.nextFloat();
        ThreeDimension obj2= new ThreeDimension(l2,b2,h2);
        obj2.calcAreaVolume();  
    } 
}
