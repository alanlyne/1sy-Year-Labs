import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String m = "";
        for(int i = 0; i < n; i++){
            m = m + sc.next().toLowerCase() + " ";
        }
        int x = sc.nextInt();
        int x1 = sc.nextInt();
        char c = sc.next().charAt(0);
        char c1 = sc.next().charAt(0);

        // Remove all whitespace from the String.
        System.out.println(manipulation(m.toLowerCase()).toLowerCase());
        // Remove all instances of the given character from the String.
        System.out.println(manipulation(m.toLowerCase(), c).toLowerCase());
        // Remove all instances in the String of the character from the given index from the String.
        System.out.println(manipulation(m.toLowerCase(), x).toLowerCase());
        // Remove all characters between the given indices (exclusive) from the String.
        System.out.println(manipulation(m.toLowerCase(), x, x1).toLowerCase());
        // Remove all characters between the given characters (exclusive) from the String.
        // This should happen between the first instance of the first character and the
        // last instance of the second character
        // in the String and if the characters are the same it should remove everything
        // between the first and last instance of the character.
        System.out.println(manipulation(m.toLowerCase(), c, c1).toLowerCase());
        // Remove all characters from the start of the String up to the xth character given.
        System.out.println(manipulation(m.toLowerCase(), c, x1).toLowerCase());
    }

    public static String manipulation(String m) {
        m = m.replaceAll("\\s", "");
        return m;
    }

    public static String manipulation(String m, char c) {
        return m.replaceAll(c+"", "");
    }

    public static String manipulation(String m, int x) {
        String c = m.charAt(x) + "";
        return m.replaceAll(c, "");
    }

    public static String manipulation(String m, int x, int x1) {
        return m.substring(0, x) + m.substring(x1);
    }

    public static String manipulation(String m, char c, char c1) {
        int index1 = m.indexOf(c)+1;
        int index2 = m.lastIndexOf(c1);
        return m.substring(0, index1) + m.substring(index2);
    }

    public static String manipulation(String m, char c, int x1) {
        while(x1 != 0){
            m = m.substring(1);
            if(m.charAt(0) == c){
                x1 -= 1;
            }
        }
        return m;
    }
}