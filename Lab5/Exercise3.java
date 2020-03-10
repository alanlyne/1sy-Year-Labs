import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double ans = sumTo(n);
        ans = Math.round(ans * 100.0) / 100.0;
        System.out.println(ans);

    }

    public static double sumTo(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Illegal Power Argument");
        }

        if (n == 0) {
            return 0.0;
        }
        return sumTo(n - 1) + (1 / (double) n);
    }
}