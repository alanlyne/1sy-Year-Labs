import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(recursiveSum(n));
    }

    public static int recursiveSum(int n) {
        if (n == 0)
            return 0;
        return (n % 10 + recursiveSum(n / 10));
    }
}