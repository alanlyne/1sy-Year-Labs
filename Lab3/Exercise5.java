import java.util.*;

public class Exercise5{
    public static void main(String[]args){
        Matches();
    }

    public static void Matches(){
        Scanner sc = new Scanner(System.in);
        
        boolean bool = true;

        while(bool){
            String regex = sc.nextLine();

            if((regex.matches("[A-Z]{2,3}[0-9]{3,4}"))){
                System.out.println("Flight code is valid");
                bool = false;
            }else{
                System.out.println("Flight code is NOT valid");
                
            }
        }       
    }
}