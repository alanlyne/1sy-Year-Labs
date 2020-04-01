import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String a = new String(bubbleSort(s1));
        String b = new String(bubbleSort(s2));

        if (a.equals(b)) {
            System.out.println(a);
        } else {
            System.out.println(a);
            System.out.println(b);
        }
    }

    public static char[] bubbleSort(String s1) {
        char[] array = new char[s1.length()];

        for (int i = 0; i < array.length; i++) {
            array[i] = s1.charAt(i);
        }

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
        return array;
    }

    public static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
