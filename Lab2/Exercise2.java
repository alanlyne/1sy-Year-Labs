import java.util.Scanner;

public class Exercise2{
    public static void main(String args[]){
        int[] ar = fillArray();
        System.out.println("Sum = " + sumArray(ar));
        System.out.println("Average = " + avgArray(ar));
        printArray(ar);
    }

    public static int[] fillArray(){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] ar = new int[length];
        for(int i = 0; i < length; i++){
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    public static int sumArray(int[] ar){
        int sum = 0;
        for(int i = 0; i < ar.length; i++){
            sum += ar[i];
        }
        return sum;
    }

    public static double avgArray(int[] ar){
        double sum = 0, avg = 0;
        for(int i = 0; i < ar.length; i++){
            sum += ar[i];
        }
        avg = sum / ar.length;
        return avg;
    }

    public static void printArray(int[] ar){
        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }
    }
}