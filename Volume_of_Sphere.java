import java.util.*;
import java.lang.Math;
public class Hypo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = (4*3.14*a*a*a)/3;
        System.out.printf("%.2f",b);
    }
}