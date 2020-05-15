public class Exercise5 {

    public static void main(String[] args) {
        int n = 107;
        if (isHappynumber(n))
            System.out.println(n + " is a Happy number");
        else
            System.out.println(n + " is not a Happy number");
    }

    public static int numSquareSum(int n) {
        int squareSum = 0;
        while (n != 0) {
            squareSum += (n % 10) * (n % 10);
            n /= 10;
        }
        return squareSum;
    }

    // method return true if n is Happy number
    public static boolean isHappynumber(int n) {
        int slow, fast;
        // initialize slow and fast by n
        slow = fast = n;
        do {
            // move slow number
            // by one iteration
            slow = numSquareSum(slow);
            // move fast number
            // by two iteration
            fast = numSquareSum(numSquareSum(fast));
        } while (slow != fast);
        // if both number meet at 1,
        // then return true
        return (slow == 1);
    }
}