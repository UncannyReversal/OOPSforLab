package sum_of_digits;
public class Sum_of_digits {
    public static void main(String[] args) {
        int a = 564;
        int n = 0;
        while(a != 0)
        {
            n += a % 10;
            a /= 10;
        }
        System.out.println(n);
    }    
}
