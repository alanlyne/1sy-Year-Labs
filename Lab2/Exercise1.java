
// Write a Java program, called Factorial that contains a static method called getFactorial(). 
// The getFactorial() method should accept an integer value as n for the initial number as well as m as the last number, both as parameters. 
// It will return nothing and print the factorial of the input parameter to the screen. 
// The main method should read in user input in the form of two integer numbers, n, and m. 
// When the code executes the factorial of all numbers from n up to m should be printed to the screen each on a new line using a loop. 
// If either of the user inputs is negative, an error message should print to the screen stating “Not Valid!”

import java.util.*;

public class Exercise1{
    public static void main (String args[]){
        System.out.println("Enter two numbers");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        if(n < 0 || m < 0){
            System.out.println("Not Valid!");
        }else{
            getFactorial(n,m);
        }
    }
    public static void getFactorial(int n, int m){
        for(int i = n; i <= m; i++){
            int output = i;
            for(int j = i-1; j > 1; j--){
                output *= j;
            }
            System.out.println(output);
        }
    }
}