import java.util.Scanner;

public class Exercise3{
    public static void main(String args[]){
        double num[] = {254.98, 3.34, 43321.54};
        Scanner sc = new Scanner(System.in);
        double doubleToFind = sc.nextDouble();
        boolean found = findElement(num, doubleToFind);
        if(found == true){
            System.out.println(doubleToFind + " was found in the array");
        }else{
            System.out.println(doubleToFind + " was NOT found in the array");
        }
    }

    public static boolean findElement(double[] ar, double num){
        boolean found = false;
        for(int i = 0; i < ar.length; i++){
            if(ar[i] == num){
                found = true;
            }
        }
        return found;
    }
}