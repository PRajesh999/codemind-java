import java.util.*;
public class DiskCapacity
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int avg = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a = (3*avg)-b-c;
        System.out.printf("%d",a);
    }
}