import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(commaNumbers(n));

    }

    public static String commaNumbers(int n) {
        return String.format("%,d", n);
    }
}
