import java.util.*;
public class Student
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = c-d;
            if(e >= b)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}