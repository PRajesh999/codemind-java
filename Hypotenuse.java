import java.util.*;
import java.lang.Math;
public class Hypo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a*a)+(b*b);
        double e = Math.sqrt(c);
        System.out.printf("%.2f",e);
    }
}