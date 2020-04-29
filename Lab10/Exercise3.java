import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        int num = sc.nextInt();
        System.out.println(caeser(s1, num));
    }

    public static String caeser(String s1, int num) {
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                result = result + ' ';
            } else if (Character.isUpperCase(s1.charAt(i))) {
                char ch = (char) (((int) s1.charAt(i) + num - 65) % 26 + 65);
                result = result + ch;
            } else {
                char ch = (char) (((int) s1.charAt(i) + num - 97) % 26 + 97);
                result = result + ch;
            }
        }
        return result;
    }
}