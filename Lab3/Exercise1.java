import java.util.*;

public class Exercise1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(Matches(s1));
    }

    public static boolean Matches(String regex){
        if(regex.matches("[01]*")){
            return true;
        }else{
            return false;
        }
        
    }
}