import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        int[] missing = {1, 4, 7, 9, 3, 6, 8, 5};
        bubbleSort(missing);
    }

    public static void bubbleSort(int [] array) {
        
        boolean isSorted = false;
        int lastUnsorted = array.length-1;
        while (!isSorted) {
            isSorted = true;
            for(int i = 0; i < lastUnsorted; i++){
                if(array[i] > array[i + 1]){
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
        for(int i = 0; i < array.length; i++){
            int current = array[i + 1];
            int next = array[i] + 1;
            if(current != next){
                System.out.println(next);
                break;
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
