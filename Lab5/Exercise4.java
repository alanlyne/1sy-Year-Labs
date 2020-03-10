import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String m = sc.nextLine();
        int x = sc.nextInt();
        int x1 = sc.nextInt();
        char c = sc.next().charAt(0);
        char c1 = sc.next().charAt(0);

        // Remove all whitespace from the String.
        manipulation(m);
        // Remove all instances of the given character from the String.
        manipulation(m, c);
        // Remove all instances in the String of the character from the given index from the String.
        manipulation(m, x);
        // Remove all characters between the given indices (exclusive) from the String.
        manipulation(m, x, x1);
        // Remove all characters between the given characters (exclusive) from the String.
        // This should happen between the first instance of the first character and the
        // last instance of the second character
        // in the String and if the characters are the same it should remove everything
        // between the first and last instance of the character.
        manipulation(m, c, c1);
        // Remove all characters from the start of the String up to the xth character given.
        manipulation(m, c, x1);
    }

    public static String manipulation(String m) {
        m = m.replaceAll("\\s", "");
        return m;
    }

    public static String manipulation(String m, char c) {
        int j, count = 0, n = m.length();
        char[] t = m.toCharArray();
        for (int i = j = 0; i < n; i++) {
            if (t[i] != c){
                t[j++] = t[i];
            }
            else{
                count++;
            }
        }
        while (count > 0) {
            t[j++] = '\0';
            count--;
        }
        String s1 = new String(t);
        return s1;
    }

    public static String manipulation(String m, int x) {
        char[] t = m.toCharArray();
        char c = m.charAt(x);
        int j, count = 0, n = m.length();
        for (int i = j = 0; i < n; i++) {
            if (t[i] != c){
                t[j++] = t[i];
            }
            else{
                count++;
            }
        }
        while (count > 0) {
            t[j++] = '\0';
            count--;
        }
        String s1 = new String(t);
        return s1;
    }

    public static String manipulation(String m, int x, int x1) {
        m = m.substring(0, x) + m.substring(x1, m.length());
    }

    public static String manipulation(String m, char c, char c1) {

    }

    public static String manipulation(String m, char c, int x1) {

    }
}