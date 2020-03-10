/*Write a static method called determineSize() that accepts two doubles. 
The method should print a message to the screen that states which number is the smallest, which is the biggest or that they are the same number. 
Test the method by calling it from the main method using user input.
*/

import java.util.Scanner;

public class Exercise3 {
    public static void main(String args[]) {
        System.out.println("PLEASE ENTER TWO DOUBLES");
        Scanner sc = new Scanner(System.in);
        double one = sc.nextDouble(), two = sc.nextDouble();
        determineSize(one, two);
    }
    public static void determineSize(double one, double two) {
        if(one == two) {
            System.out.println("NUMBERS ARE THE SAME");
        }
        else if(one < two) {
            System.out.println("Largest = " + two);
            System.out.println("Smallest = " + one);
        }
        else if (one > two) {
            System.out.println("Largest = " + one);
            System.out.println("Smallest = " + two);
        }
        else {
            System.out.println("ERROR PLEASE TRY AGAIN");
            determineSize(one,two);
        }
    }
}
