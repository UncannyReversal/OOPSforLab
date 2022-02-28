package fibanocci;
public class Fibanocci {
    public static void main(String[] args) {
        int a=0,b=1,c=0;
        for(int i=0;i<10;i++)
        {
            System.out.print(c+" ");
            a = b;
            b = c;
            c = a + b;
        }
    }
    
}
