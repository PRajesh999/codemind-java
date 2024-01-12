import java.util.*;
public class Temperature {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        double t=32+(c*1.8);
        System.out.printf("%.2f",t);
}
}