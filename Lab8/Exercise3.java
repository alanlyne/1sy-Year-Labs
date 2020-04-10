import java.util.*;
import java.lang.Math.*;

public class Exercise3 {
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

class Dice {

    private int numOfSides;
    private int faceValue;
    private double PI = Math.PI;

    Random rn = new Random();

    public Dice() {
        numOfSides = 6;
        faceValue = rn.nextInt(6) + 1;
    }

    public Dice(int r, int s) {
        numOfSides = r;
        faceValue = s;
    }

    public void setnumOfSides(int num) {
        numOfSides = num;
    }

    public int getnumOfSides() {
        return numOfSides;
    }

    public void setfaceValue(int num) {
        faceValue = num;
    }

    public int getfaceValue() {
        return faceValue;
    }

    public int rollDice() {
        return rn.nextInt(numOfSides) + 1;
    }

}
