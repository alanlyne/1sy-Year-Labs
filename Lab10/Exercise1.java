import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfNum = -1;
        String n = sc.nextLine();
        String m = sc.nextLine();

        String num = n + m;

        for (int i = 0; i < num.length(); i++) {
            char temp = num.charAt(i);
            for (int j = 0; j < num.length(); j++) {
                if (temp == num.charAt(j)) {
                    numOfNum++;
                }
            }
            if (numOfNum > 0) {
                System.out.println(temp + " " + numOfNum);
                break;
            }
        }
    }
}