import java.util.*;

public class Exercise4{
    public static void main(String[]args){
        Matches();
    }

    public static void Matches(){
        Scanner sc = new Scanner(System.in);
        
        boolean bool = true;

        while(bool){
            String regex = sc.nextLine();

            if((regex.matches("[A-Z][a-z]*")) && (regex.length() <= 25)){
                System.out.println("Name is valid");
                bool = false;
            }else{
                System.out.println("Name is NOT valid");
                
            }
        }       
    }
}