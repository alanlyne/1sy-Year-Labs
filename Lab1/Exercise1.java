// Write a Java program, called Seasons, which contains a static method called printSeason() which takes no input parameters and returns nothing. 
// The printSeason() method should get the user to input a single integer value between 1 and 12 representing a month of the year and print a 
// message saying what Season it is. (see table below for Months and Seasons). 
// To test the printSeason() method you should call it from the main method.


import java.util.Scanner;

public class Exercise1 {
    public static void main(String args[]) {
        printSeason();
    }
    public static void printSeason() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER BETWEEN 1-12");
        int num = sc.nextInt();
        String month = "", season = "";
        switch (num) {
            case 1:
                month = "January";
                season = "Winter";
                break;
            case 2:
                month = "February";
                season = "Winter";
                break;
            case 3:
                month = "March";
                season = "Spring";
                break;
            case 4:
                month = "April";
                season = "Spring";
                break;
            case 5:
                month = "May";
                season = "Spring";
            case 6:
                month = "June";
                season = "Summer";
                break;
            case 7:
                month = "July";
                season = "Summer";
                break;
            case 8:
                month = "August";
                season = "Summer";
                break;
            case 9:
                month = "September";
                season = "Autumn";
                break;
            case 10:
                month = "October";
                season = "Autumn";
                break;
            case 11:
                month = "November";
                season = "Autumn";
                break;
            case 12:
                month = "December";
                season = "Winter";
                break;
        }
        if(month=="" || season=="") {
            System.out.println("PLEASE ENTER A VALID MONTH");
            printSeason();
        }
        else {
            System.out.println(month + " is in " + season);
        }
    }
}
