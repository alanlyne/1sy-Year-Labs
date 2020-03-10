import java.util.*;

public class Exercise3{
    public static void main(String[]args){
        Matches();
    }

    public static void Matches(){
        Scanner sc = new Scanner(System.in);
        
        boolean bool = true;

        while(bool){
            String regex = sc.nextLine();
            int x = Integer.parseInt(regex);

            if((regex.matches("[0-9]+")) && (x <= 150) && (x > 0)){
                System.out.println("Age is valid");
            }else{
                System.out.println("Age is NOT valid");
                bool = false;
            }
        }       
    }
}