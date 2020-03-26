import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println(n + "" + combine(n));
        } else {
            System.out.println("Not a valid entry!");
        }
    }

    public static int combine(int n) {
        int rev = 0;
        while (n != 0) {
            int num = n % 10;
            rev = rev * 10 + num;
            n = n / 10;
        }
        return rev;
    }
}
