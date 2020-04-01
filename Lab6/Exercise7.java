import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        System.out.println(moreAs(s1));
    }

    public static String moreAs(String s1) {
        if (s1.isEmpty()) {
            return s1;
        } else if (s1.charAt(0) == 'a') {
            return "aaa" + moreAs(s1.substring(1));
        } else {
            return s1.charAt(0) + moreAs(s1.substring(1));
        }
    }
}
