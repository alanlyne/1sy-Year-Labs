import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        System.out.println(evenDigits(input));
    }
    public static int evenDigits(int num){
        String s_num = Integer.toString(num);
        if(s_num.equals("0")){
            return num;
        }else{
            String lastDigit = s_num.charAt(s_num.length()-1) + "";

            if(lastDigit.matches("[013579]")){
                s_num = s_num.substring(0, s_num.length()-1);

                if(s_num.length() == 0){
                    return evenDigits(0);
                }else{
                    return evenDigits(Integer.parseInt(s_num));
                }
            }else{
                num = num/10;
                return Integer.parseInt(Integer.toString(evenDigits(num)) + lastDigit);
            }
        }
    }
}