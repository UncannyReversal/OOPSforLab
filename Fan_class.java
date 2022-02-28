package fan_class;
class fan
{
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed;
    boolean f_on;
    double radius;
    String color ;
    fan()
    {
        speed = SLOW;
        f_on = false;
        radius = 4;
        color = "blue";   
    }
    fan(int s,boolean o,double r,String c)
    {
        speed = s;
        f_on = o;
        radius = r;
        color = c;
    }
    void display()
    {
        if(f_on == true)
        {
            System.out.println("Speed: "+speed);
            System.out.println("Color: "+color);
            System.out.println("Radius: "+radius); 
        }
        else
        {
            System.out.println("Fan is off");
            System.out.println("Color: "+color);
            System.out.println("Radius: "+radius);
        }
    }
}
public class Fan_class 
{
    public static void main(String[] args) 
    {
       fan obj1 = new fan();
       fan obj2 = new fan(2,true,6,"brown");
       obj1.display();
       System.out.println();
       obj2.display();
    } 
}
