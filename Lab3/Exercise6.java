import java.util.*;

public class Exercise{
    public static void main(String[]args){
        Matches();
    }

    public static void Matches(){
        Scanner sc = new Scanner(System.in);
        String regex = sc.nextLine();

        if((regex.matches("[cgat]*"))){
            System.out.println("true");
        }else{
            System.out.println("true");
                
        }       
    }
}