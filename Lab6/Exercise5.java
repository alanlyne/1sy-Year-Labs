import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] hand = new String[5];
        for(int i = 0; i < 5; i++){
            hand[i] = sc.nextLine();
        }
        fullHouseCheck(hand);
    }

    public static void fullHouseCheck(String [] hand) {
        Arrays.sort(hand);
        int temp = 0;
        String card = "";
        for(int i = 0; i < 4; i++){
            if(hand[i] == hand [i+1]){
                temp++;
                card = hand[i];
            }
                if(temp > 1){
                    System.out.println(temp + " of a kind: " + card);
                
            }
        }
    }
}
