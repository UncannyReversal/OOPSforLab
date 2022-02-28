package prime_number_1_to_n;
import java.util.*;
public class Prime_number_1_to_n {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.print("Enter the number upto which prime number required: ");
        int n = object.nextInt();
        for(int i = 2;i <= n;i++)
        {
            int count = 0;
            for(int j = 1; j <= i/2; j++)
            {
                if(i%j == 0 && count <= 1)
                    count++;
            }
            if(count == 1)
                System.out.print(i+" ");
        }
    } 
}
