
/*
Write a java program that takes in a number N and finds the smallest palindrome prime greater than or equal to N. 
This should be done by creating two methods, one to check if the number is prime and one to check if the number is a palindrome.
*/
import java.util.*;

public class Exercise6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        boolean validation = false;
        boolean check = false;
        boolean check2 = false;
        String convert = Integer.toString(input);

        while (validation == false) {
            check = isPrime(input);
            convert = Integer.toString(input);
            if (check == false) {
                input++;
            } else {
                check2 = isPalindrome(convert);
                if (check2 == true) {
                    System.out.println("Next pal is " + input);
                    validation = true;
                } else {
                    input++;
                }
            }

        }
    }

    public static boolean isPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static boolean isPalindrome(String input) {
        boolean isPalindrome = true;
        String store = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            store = store + input.charAt(i);
        }
        if (store.equals(input)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }
        return isPalindrome;
    }
}
