import java.util.*;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // char n[] = m.toCharArray();

        n = countEights(n);
        System.out.println("Result = " + n);

    }

    public static int countEights(int n) {
        int c = 0;

        if (n == 0) {
            return 0;
        } else {
            if (n % 10 == 8 && (n / 10) % 10 == 8) {
                c += 2;
            } else if (n % 10 == 8 && (n / 10) % 10 != 8) {
                c++;
            }
        }
        return c + countEights(n / 10);
    }
}