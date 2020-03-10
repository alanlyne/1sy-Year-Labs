import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        
        System.out.println(reverseString(n));
    }

    public static String reverseString(String n){
        if (n.isEmpty())
            return n; 
        
        return reverseString(n.substring(1)) + n.charAt(0);
    }
}