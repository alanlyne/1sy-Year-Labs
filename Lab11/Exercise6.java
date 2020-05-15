public class Exercise6 {
    public static void main(String[] args) {
        int num = 23336014;
        palindrome(num);
    }

    public static void palindrome(int ogNum) {
        int num = ogNum;
        int temp = num, sum = 0, remainder = 0;
        while (num > 0) {
            remainder = num % 10; // getting remainder
            sum = (sum * 10) + remainder;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println(temp);
        } else {
            child(temp);
        }
    }

    public static void child(int child) {
        String sChild = Integer.toString(child);

        if ((sChild.length() > 1)) {
            // sChild = sChild.substring(0, sChild.length() - 1);
            // int newChild = Integer.parseInt(sChild.substring(1));
            // System.out.println(newChild);
            int j = 0;
            int len = sChild.length();
            int[] arr = new int[len];

            while (child != 0) {
                arr[len - j - 1] = child % 10;
                child = child / 10;
                j++;
            }
            int sum = 0;
            String num = "";
            for(int i = 0; i < arr.length; i = i+2){
                sum = arr[i] + arr[i+1];
                
                String sSum = Integer.toString(sum);
                num += sSum;
            }

            int newChild = Integer.parseInt(num);
            palindrome(newChild);
        } else {
            System.out.println("-1");
        }
    }
}