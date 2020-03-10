import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        // char n[] = m.toCharArray();

        m = cleanString(m);
        System.out.println(m);

    }

    public static String cleanString(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return cleanString(str.substring(1));
        } else {
            return str.charAt(0) + cleanString(str.substring(1));
        }
    }
}