import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int start = 1, end = 10;
        binaraySearch(start, end, n);
    }

    public static void binaraySearch(int start, int end, int guess) {
        int counter = 0;
        int [] array = new int[end+1];
        for(int i = start; i <= end; i++){
            array[i] = i;
        }
        boolean found = false;
        int high = array.length-1, low = 0, middle = 0;

        while(low <= high && !found){
            middle = (high + low)/2;
            if(guess < array[middle]){
                high = middle - 1;
                counter++;
            }else if(guess > array[middle]){
                low = middle + 1;
                counter++;
            }else{
                found = true;
            }
        }
        System.out.println("The number is: " + guess);
        System.out.println("It took " + counter + " tries");
    }

}
