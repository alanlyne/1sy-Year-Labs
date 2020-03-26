import java.util.*;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        difference(s1, s2);
    }

    public static void difference(String s1, String s2) {
        int sum1 = 0;
        for(int i = 0; i < s1.length(); i++){
            int asciiValue = s1.charAt(i);
            sum1 += asciiValue;
        }

        int sum2 = 0;
        for(int i = 0; i < s2.length(); i++){
            int asciiValue = s2.charAt(i);
            sum2 += asciiValue;
        }

        int diff = Math.abs(sum1 - sum2);

        System.out.println(diff);
    }
}
