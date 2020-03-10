import java.util.*;
public class Exercise2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(powerTo(x, y));
        
    }

    public static int powerTo(int x, int y){

        if ( y == 0 ) {
            return 1;
        }
        return ( x * powerTo(x,y-1));

        // if (y == 0) {
        //     return 1.0;
        // }
        // if (y < 0) {
        //     // Negative power.
        //     if (x == 0) {
        //         throw new IllegalArgumentException(
        //                 "It's impossible to raise 0 to the power of a negative number");
        //     }
        //     return 1 / powerTo(x, -y);
        // } else {
        //     // Positive power
        //     double powerOfHalfN = powerTo(x, y / 2);
        //     if (y % 2 == 1) {
        //         // Odd n
        //         return y * powerOfHalfN * powerOfHalfN;
        //     } else {
        //         // Even n
        //         return powerOfHalfN * powerOfHalfN;
        //     }
        // }
    }
}