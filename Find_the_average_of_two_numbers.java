import java.util.*;
public class Avg
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = (a+b)*0.5f;
        System.out.printf("%.4f",c);
    }
}