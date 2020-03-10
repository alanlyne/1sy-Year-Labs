import java.util.Scanner;

public class Exercise5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();
        shape = shape.trim(); //removes spaces
        if(shape.equalsIgnoreCase("Square")){
            int side = sc.nextInt();
            System.out.println("Area: " + area(side));
        }
        else if(shape.equalsIgnoreCase("Rectangle")){
            int width = sc.nextInt(), height = sc.nextInt();
            System.out.println("Area: " + area(width, height));
        }
        else if(shape.equalsIgnoreCase("Triangle")){
            double base = sc.nextDouble();
            int height = sc.nextInt();
            System.out.println("Area: " + area(base, height));
        }
        else if(shape.equalsIgnoreCase("Circle")){
            double radius = sc.nextDouble();
            System.out.println("Area: " + area(radius));
        }
        else if(shape.equalsIgnoreCase("Ellipse")){
            double major = sc.nextDouble(), minor = sc.nextDouble();
            System.out.println("Area: " + area(major, minor));
        }
        else{
            System.out.println("Not a valid shape");
        }
    }

    public static double area(int len){
        double area = 0;
        area = Math.pow(len, 2);
        return area;
    }

    public static double area(int height, int width){
        double area = 0;
        area = area * width;
        return area;
    }

    public static double area(double base, int height){
        double area = 0;
        area = (base * height) / 2;
        return area;
    }

    public static double area(double radius){
        double area = 0;
        area = Math.PI * (Math.pow(radius, 2));
        return area;
    }

    public static double area(double major, double minor){
        double area = 0;
        area = Math.PI * (major / 2) * (minor / 2);
        return area;
    }
}