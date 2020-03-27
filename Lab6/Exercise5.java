import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] hand = new String[5];
        for (int i = 0; i < 5; i++) {
            hand[i] = sc.nextLine();
        }
        fullHouseCheck(hand);
    }

    public static void fullHouseCheck(String[] hand) {

        Arrays.sort(hand);
        int distinct = 0;
        int count = 1;
        String card = "";
        for (int i = 0; i < 5; i++) {
            if (!hand[i].equals(card)) {
                count = 1;
                distinct++;
            } else {
                count++;
            } if(count > 3){
                break;
            }
            card = hand[i];
        }
        if(distinct > 2 || count > 3){
            System.out.println("Not a full house");
        } else{
            System.out.println("3 of a kind is: " + hand[2]);
            System.out.println("2 of a kind is: " + hand[4]);
        }
    }
}
