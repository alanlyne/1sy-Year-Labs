import java.util.Scanner;

public class Exercise4{
    public static void main(String args[]){
        String words[][] = {{"cat", "dUck", "dog"}, {"rabbit", "hen", "duCk"}, {"dUck", "DuCK", "goose"}};
        Scanner sc = new Scanner(System.in);
        String search = sc.nextLine();
        int count = countStrings(words, search);
        if(count > 0){
            System.out.println(search + " is contained " + count + " times");
        }else{
            System.out.println(search + " was not found");
        }
    }

    public static int countStrings(String[][] words, String search){
        int count = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length; j++){
                System.out.println(words[i][j].toLowerCase());
                if(search.toLowerCase().equals(words[i][j].toLowerCase())){
                    System.out.println(words[i][j]);
                    count++;
                }
            }
        }
        return count;
    }
}