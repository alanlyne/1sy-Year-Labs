/*
In a class, write a method called printStarTriangle() that accepts an integer parameter and returns nothing. 
This method should print to the screen rows of asterisk characters that form the shape of a triangle. 
The amount of rows is based on the value of the integer parameter. 
The first row should start with one * and increment by one * for each row there after.
*/

import java.util.Scanner;

public class Exercise2 {
    public static void main(String args[]) {
        printStarTriangle();
    }
    public static void printStarTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER A NUMBER");
        int num = sc.nextInt(), count=1;
        for(int i=0;i<num;i++) {
            for(int j=0;j<count;j++){
                System.out.print("*");
            }
            System.out.println();
            count++;
        }
    }
}
