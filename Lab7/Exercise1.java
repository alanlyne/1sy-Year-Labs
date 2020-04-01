import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        bubbleSort(s1);
    }

    public static void bubbleSort(String s1) {
        char [] array = new char[s1.length()];

        for(int i = 0; i < array.length; i++){
            array[i] = s1.charAt(i);
        }

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
            System.out.print(array[i]);
        }
    }

    public static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
