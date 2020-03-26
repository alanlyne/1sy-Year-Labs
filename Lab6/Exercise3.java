import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        mexicanWave(s1);
        
    }

    public static void mexicanWave(String s1) {
        String [] array = new String[s1.length()];

        for(int i = 0; i < s1.length(); i++){
            if(!s1.substring(i, i+1).equals(" ")){
                s1 = s1.toLowerCase();
                array[i] = s1.substring(0, i) + s1.substring(i, i+1).toUpperCase() + s1.substring(i+1);
                System.out.println(array[i]+ ", ");
            }
        }
    }
}
