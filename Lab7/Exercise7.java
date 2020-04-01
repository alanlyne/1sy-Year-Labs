import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        bubbleSort(array);
    }

    public static void bubbleSort(int [] array) {
        int a, b;
        boolean isSorted = false;
        int lastUnsorted = array.length-1;
        while (!isSorted) {
            isSorted = true;
            for(int i = 0; i < lastUnsorted; i++){
                int alength = String.valueOf(array[i]).length();
                int blength = String.valueOf(array[i+1]).length();
                if(alength <= blength){
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
