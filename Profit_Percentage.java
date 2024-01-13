import java.util.*;
public class Loss{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = y - x;
        float c = (a*100f)/x ;
        System.out.printf("%.2f",c);
    }
}