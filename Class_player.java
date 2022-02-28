package class_player;
import java.util.*;

class player{
    String pname;
    int innings,runs,notouts;
    void showdata()
    {
        System.out.println("\nPlayer Details: ");
        System.out.println("Name: "+pname);
        System.out.println("Innings played: "+innings);
        System.out.println("Runs Scored: "+runs);
        System.out.println("Not Out: "+notouts);
    }
    void calcAvg()
    {
        if(innings <= notouts)
            System.out.println("Enter Correct input....");
        else{
        double bat_avg=runs/(innings-notouts);
        System.out.println("Batting Average= "+bat_avg);
        }
    }
    player(String name,int inn,int run,int n_outs)
    {
        pname=name;
        innings=inn;
        runs=run;
        notouts=n_outs;
    }
}
public class Class_player {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Player details: ");
        System.out.print("Enter name: ");
        String name=s.nextLine();
        System.out.print("Enter innings played: ");
        int inn=s.nextInt();
        System.out.print("Runs Scored: ");
        int run=s.nextInt();
        System.out.print("Not Outs: ");
        int n_out=s.nextInt();
        player p1=new player(name,inn,run,n_out);
        p1.showdata();
        p1.calcAvg();
    }
    
}
