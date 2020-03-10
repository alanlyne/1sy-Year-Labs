/*
Write a java program that takes in a number N and finds the smallest palindrome prime greater than or equal to N. 
This should be done by creating two methods, one to check if the number is prime and one to check if the number is a palindrome.
*/

public class Exercise6 {
    public static void main(String args[]) {

    }
    public static boolean isPrime(int num) {
        boolean check = true;
        for(int i=2;i<num;i++) {
            if(num % i == 0) {
                check = false;
            }
        }
        return check;
    }
}
