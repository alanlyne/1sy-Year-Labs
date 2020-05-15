import java.lang.reflect.Array;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 9, 3, 6, 8, 5 };
        arr = bubble(arr);
        System.out.println(mean(arr) + "\n" + mode(arr) + "\n" + median(arr));
    }

    public static int[] bubble(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }

    public static double mean(int[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        double mean = total / arr.length;
        return Math.round(mean * 100.0) / 100.0;
    }

    public static int mode(int[] arr) {
        int maxValue = arr[0];
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static double median(int[] arr) {
        double median;
        // get count of scores
        int totalElements = arr.length;
        // check if total number of scores is even
        if (totalElements % 2 == 0) {
            int sumOfMiddleElements = arr[totalElements / 2] + arr[totalElements / 2 - 1];
            // calculate average of middle elements
            median = ((double) sumOfMiddleElements) / 2;
        } else {
            // get the middle element
            median = (double) arr[arr.length / 2];
        }
        return median;
    }
}