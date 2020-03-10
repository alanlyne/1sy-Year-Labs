/*
Write a java program called Primes. 
This program should contain a method called isPrime() that accepts an integer parameter and returns a boolean value. 
This method should check if the integer is a prime number or not and return an appropriate boolean value. 
The main method should call the isPrime() method and print an appropriate messge to the screen.
*/

import java.util.Scanner;

public class Exercise5 {
    public static void main(String args[]) {
        System.out.println("PLEASE ENTER A NUMBER");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean check = isPrime(num);
        if(!check) {
            System.out.println(num + " is NOT a Prime number");
        }
        else {
            System.out.println(num + " is a Prime number");
        }
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
