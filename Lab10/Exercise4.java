import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.println(countDots(x) + " dots");
    }

    public static int countDots(int n){
        if(n == 1){ 
            return 1;
        }
        return 5 * (n - 1) + countDots(n - 1);
    }

}