package queue_text_colour;
import java.util.*;

class printer
{
    String str;
    printer(String str)
    {
    this.str = str;    
    }
    void enqueue(Queue q,String str)
    {
          q.add(str);
    } 
    void dequeue(Queue q,String str)
    {
          q.remove(str);
    }    
}

public class Queue_text_colour 
{
    public static void main(String[] args) 
    {
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        while(true)
        {
            System.out.println("\n1)input for text queue\n2)input for colour queue\n3)exit\n");
            System.out.print("Enter the value: ");
            Scanner o = new Scanner(System.in);
            int n = o.nextInt();
            System.out.println("");
            switch(n)
            {
                case 1:
                    System.out.print("Enter the string: ");
                    String str = o.next();
                    printer r = new printer (str);
                    r.enqueue(q1, str);
                    break;
                case 2:
                    System.out.print("Enter the string: ");
                    String st = o.next();
                    printer r1 = new printer (st);
                    r1.enqueue(q2, st);
                    break;
                case 3: 
                    Iterator i1 = q1.iterator();
                    Iterator i2 = q2.iterator();
                    while(i1.hasNext() && i2.hasNext() )
                    {
                        System.out.println(i1.next() + " colour is " + i2.next());
                    }   
                    System.out.println("");
                    System.exit(0);
            }
        } 
    }    
}
