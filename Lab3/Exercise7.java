import java.util.*;

public class Exercise7{
    public static void main(String[]args){
        Matches();
    }

    public static void Matches(){
        Scanner sc = new Scanner(System.in);
        String regex = sc.nextLine();

        if((regex.matches("^.*1234.*$"))){
            System.out.println("Alarm Deactivated");
        }else{
            System.out.println("Alarm Activated");
                
        }       
    }
}