import java.util.*;

public class Exercise8{
    public static void main(String[]args){
        Matches();
    }

    public static void Matches(){
        Scanner sc = new Scanner(System.in);
        String regex = sc.nextLine();

        int count = 0;

        if(regex.matches(".*{8,}"))
        {
            count += 1;
        }
        if(regex.matches(".*{12,}"))
        {
            count += 1;
        }
        if(regex.matches("^.*[a-z]{1,}.*$"))
        {
            count += 1;
        }
        if(regex.matches("^.*[a-z]{2,}.*$"))
        {
            count += 1;
        }
        if(regex.matches("^.*[A-Z]{1,}.*$"))
        {
            count += 1;
        }
        if(regex.matches("^.*[A-Z]{2,}.*$"))
        {
            count += 1;
        }
        if(regex.matches("^.*[0-9]{1,}.*$"))
        {
            count += 1;
        }
        if(regex.matches("^.*[#|!|?|@]{1,}.*$"))
        {
            count += 1;
        }
        if(regex.matches("^.*[#|!|?|@]{2,}.*$"))
        {
            count += 1;
        }

        System.out.println(count);
    }
}

