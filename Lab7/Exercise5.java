import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int n = uniqueSort(array);

        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");

    }

    public static int uniqueSort(int[] array) {
        int n = array.length;
        boolean isSorted = false;
        int lastUnsorted = array.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }

        if (n == 0 || n == 1){
            return n;
        }
        int[] temp = new int[n];

        int j = 0;
        for (int i = 0; i < n - 1; i++)
            if (array[i] != array[i + 1])
                temp[j++] = array[i];

        temp[j++] = array[n - 1];

        for (int i = 0; i < j; i++){
            array[i] = temp[i];
        }
        return j;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
