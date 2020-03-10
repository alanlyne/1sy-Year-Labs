import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(q1Recursive(n));
        System.out.println(q1Iterative(n));
    }

    public static int q1Iterative(int n) {
        int sum = 2;
        int neg = 0;
        int i;
        for (i = 2; i <= n; i++) {
            neg = (3 * (i));
            sum = ((4 * sum) - neg);
        }
        return sum;
        
    }

    public static int q1Recursive(int n) {
        int sum = 0;
            if (n == 1) {
                sum += 2;
            }else{
                sum += (4 * (q1Recursive(n-1))) - (3 * n);
            }
        return sum;
    }
}