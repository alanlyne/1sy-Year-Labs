import java.util.*;
public class Exercise1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();
        String m = sc.nextLine();
        int n = sc.nextInt();

        System.out.println(checkForSub(x, m, n));
        
    }

    public static Boolean checkForSub(String s1, String sub, int n){

        int n1 = s1.length();
        int n2 = sub.length();

        int temp = n;

        if(n1 == 0 || n1 < n2){
            return false;
        }

        if(n == 0){
            return true;
        }

        if(s1.substring(0, n2).equals(sub)){
            checkForSub(s1.substring(n2 -1), sub, n-1);
        }
        
        checkForSub(s1.substring(n2 -1), sub, n);
        return false;

    }
}