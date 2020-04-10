import java.util.*;
import java.lang.Math.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dice myDice = new Dice();

        int sideNum = myDice.getnumOfSides();
        int faceNum = myDice.getfaceValue();

        System.out.println("Dice has " + sideNum + " number of sides");
        System.out.println("Dice is on the " + faceNum + " side");

        myDice.setnumOfSides(sc.nextInt());
        int result = myDice.rollDice();

        System.out.println("Dice landed on " + result);
    }
}

class Employee {

    private String name;
    private String jobTitle;
    private float salary;
    private int employeeID;
    
    private static int lastEmployeeID = 1000; 

    public Employee(){
        this.name = "Mary Jones";
        this.jobTitle = "Doctor";
        this.salary = 19000f;

        lastEmployeeID++;

        this.employeeID = lastEmployeeID;
    }

    public Employee(String name, String jobTitle, float salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;

        lastEmployeeID++;

        this.employeeID = lastEmployeeID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public void setSalary(float sal){
        if(sal >= 19000f){
            this.salary = sal;
        }else{
            System.out.println("Entered a salary of " + sal + ". This is too low");
            this.salary = 19000f;
        }
    }

    public String getName(){
        return this.name;
    }

    public String getJobTitle(){
        return this.jobTitle;
    }

    public float getSalary(){
        return this.salary;
    }

    public int getEmployeeID(){
        return this.employeeID;
    }

    public void showEmp(){
        System.out.println("EMPLOYEE RECORD");
        String details = "NAME: " + this.name;
        details += "\nJOB TITLE: " + this.jobTitle;
        details += "\nCURRENT SALARY: " + this.salary;
        details += "\nEMPLOYEE ID: " + this.employeeID;
        System.out.println(details);
    }

    public String toString(){
        String details = "NAME: " + getName();
        details += "\nJOB TITLE: " + getJobTitle();
        details += "\nCURRENT SALARY: " + getSalary();
        details += "\nEMPLOYEE ID: " + getEmployeeID();
        return details;
    }
}
