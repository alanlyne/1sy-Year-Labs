/*
In a java program, write a method called isPailindrome() that accepts a String parameter and returns a Boolean. 
This method should check if the String is a Palindrome and return an appropriate boolean value. 
Your method should work irrespective of case. 
In the main method, you should call the method with a user inputted String being passed into isPailindrome().
*/

import java.util.Scanner;

public class Exercise4 {
    public static void main(String args[]){
        System.out.println("PLEASE ENTER A STRING");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean check = isPalindrome(input);
        if(!check) {
            System.out.println(input + " is NOT a palindrome");
        }
        else {
            System.out.println(input + " is a Palindrome");
        }
    }
    public static boolean isPalindrome(String input) {
        Boolean isPal = true;
        String inputLow = input.toLowerCase();
        for(int i=0;i<inputLow.length()/2;i++) {
            if(inputLow.charAt(i) != inputLow.charAt((inputLow.length()-1)-i)) {
                isPal = false;
                break;
            }
        }
        return isPal;
    }
}
