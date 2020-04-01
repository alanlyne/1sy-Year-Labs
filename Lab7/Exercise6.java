import java.util.*;

public class Exercise6 {
    public static void main(String[] args) {
        
        char letters[] = {'l', 'o', 'e', 'h', 'l'};
        int positions[] = {2, 4, 1, 0, 3};
        uniqueSort(letters, positions);

    }

    public static void uniqueSort(char letters[], int positions[]) {
        int n = positions.length;
        boolean isSorted = false;
        int lastUnsorted = positions.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (positions[i] > positions[i + 1]) {
                    swap(letters, positions, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
        for (int i = 0; i < n; i++)
            System.out.print(letters[i]);
    }

    public static void swap(char[] letters, int[] positions, int i, int j) {
        int temp = positions[i];
        positions[i] = positions[j];
        positions[j] = temp;

        char chatTemp = letters[i];
        letters[i] = letters[j];
        letters[j] = chatTemp;
    }
}
