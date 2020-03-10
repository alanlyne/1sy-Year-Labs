import java.util.*;

public class Exercise2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        Matches(s1);
    }

    public static void Matches(String regex){
        boolean a = false, b=false, c = false, d = false;
        if(regex.matches("a(b|a)b")){
            System.out.println(1);
            a = true;
        }
        if(regex.matches("(ab)*b")){
            System.out.println(2);
            b = true;
        }
        if(regex.matches("a(b|a)*")){
            System.out.println(3);
            c = true;
        }
        if(regex.matches("((a|b)a)*")){
            System.out.println(4);
            d = true;
        }
        else if((a == false) && b == false && c == false && d == false){
            System.out.println("Not in the language");
        }
        
    }
}