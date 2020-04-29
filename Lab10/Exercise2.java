import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();

        char[] inputArray = s1.toCharArray();
        char[] result = new char[inputArray.length];

        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] == ' '){
                result[i] = ' ';
            }
        }

        int j = result.length - 1;
        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] != ' '){
                if(result[j] == ' '){
                    j--;
                }
                result[j] = inputArray[i];
                result[j] = Character.toLowerCase(result[j]);
                j--;
            }
        }
        
        for(int i = 0; i < inputArray.length; i++){
            if(Character.isUpperCase(inputArray[i])){
                result[i] = Character.toUpperCase(result[i]);
            }
        }
        System.out.println(String.valueOf(result));
    }
}