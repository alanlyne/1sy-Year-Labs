import java.util.*;
import java.lang.Math.*;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //double radius = sc.nextDouble();
        
        BasicCircle myCircle = new BasicCircle(sc.nextInt());
        BasicCircle myCircle1 = new BasicCircle(sc.nextInt());
        BasicCircle myCircle2 = new BasicCircle(sc.nextInt());
        
        int number1 = myCircle.getRadius(); 
        int number2 = myCircle1.getRadius();
        int number3 = myCircle2.getRadius();

        System.out.println("Circle 1 has a radius of " + number1);
        System.out.println("Circle 2 has a radius of " + number2);
        System.out.println("Circle 3 has a radius of " + number3);

        double circum1 = myCircle.getCircumference();
        double circum2 = myCircle1.getCircumference();
        double circum3 = myCircle2.getCircumference();

        System.out.println("Circle 1 has a circumference of " + circum1);
        System.out.println("Circle 2 has a circumference of " + circum2);
        System.out.println("Circle 3 has a circumference of " + circum3);

        double area1 = myCircle.getArea();
        double area2 = myCircle1.getArea();
        double area3 = myCircle2.getArea();

        System.out.println("Circle 1 has an area of " + area1);
        System.out.println("Circle 2 has an area of " + area2);
        System.out.println("Circle 3 has an area of " + area3);
    }

}

class BasicCircle {

    private int radius;
    private double PI = Math.PI;

    public BasicCircle() {
        radius = 1;
    }

    public BasicCircle(int r) {
        radius = r;
    }

    public void setRadius(int num) {
        radius = num;
    }

    public int getRadius() {
        return radius;
    }

    public double getCircumference() {
        double sum = 2 * PI * radius;
        return Math.round(sum*100.0)/100.0;
    }

    public double getArea() {
        double sum = PI * radius * radius;
        return Math.round(sum*100.0)/100.0;
    }
}
