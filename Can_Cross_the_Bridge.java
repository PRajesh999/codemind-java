import java.util.*;
public class DiskCapacity
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = c - b;
        int r = d / a;
        System.out.printf("%d",r);
    }
}