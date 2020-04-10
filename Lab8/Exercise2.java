import java.util.*;
import java.lang.Math.*;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //double len = sc.nextDouble();
        
        BasicSquare mySquare = new BasicSquare(sc.nextInt());
        BasicSquare mySquare1 = new BasicSquare(sc.nextInt());
        BasicSquare mySquare2 = new BasicSquare(sc.nextInt());
        
        int number1 = mySquare.getlen(); 
        int number2 = mySquare1.getlen();
        int number3 = mySquare2.getlen();

        System.out.println("Square 1 has a len of " + number1);
        System.out.println("Square 2 has a len of " + number2);
        System.out.println("Square 3 has a len of " + number3);

        double circum1 = mySquare.getPerimeter();
        double circum2 = mySquare1.getPerimeter();
        double circum3 = mySquare2.getPerimeter();

        System.out.println("Square 1 has a Perimeter of " + circum1);
        System.out.println("Square 2 has a Perimeter of " + circum2);
        System.out.println("Square 3 has a Perimeter of " + circum3);

        double area1 = mySquare.getArea();
        double area2 = mySquare1.getArea();
        double area3 = mySquare2.getArea();

        System.out.println("Square 1 has an area of " + area1);
        System.out.println("Square 2 has an area of " + area2);
        System.out.println("Square 3 has an area of " + area3);
    }

}

class BasicSquare {

    private int len;
    private double PI = Math.PI;

    public BasicSquare() {
        len = 1;
    }

    public BasicSquare(int r) {
        len = r;
    }

    public void setlen(int num) {
        len = num;
    }

    public int getlen() {
        return len;
    }

    public double getPerimeter() {
        return 4 * len;
    }

    public double getArea() {
        //double sum = PI * len * len;
        return Math.pow(len, 2);
    }
}
