import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        FiveOrMore(s1);
    }

    public static void FiveOrMore(String s1) {
        String[] str = s1.split(" ");
        String reverse = "";

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() >= 5) {
                for (int j = str[i].length() - 1; j >= 0; j--) {
                    reverse = reverse + str[i].charAt(j);
                }
                System.out.print(reverse + " ");
                reverse = "";
            } else {
                System.out.print(str[i] + " ");
            }
        }
    }
}
